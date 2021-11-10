package br.ies.aula.controledenotas.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.ies.aula.controledenotas.modelo.banco.BancoException;
import br.ies.aula.controledenotas.modelo.banco.BancoJdbc;

public class RegistroNotaBD extends RegistroNota{
	private static final String SQL_INSERT = "INSERT INTO public.registrodenotas(\r\n"
			+ "	idusuario, ano, idmateria, notaum, notaumrecuperacao, notadois, notadoisrecuperacao, mediafinal)\r\n"
			+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

	public void inserir(RegistroNota registroNota) {
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
				
		try {
			statement = conexao.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
			
			statement.setLong(1, registroNota.getAluno().getId());
			statement.setInt(2, registroNota.getAno());
			statement.setLong(3, registroNota.getMateria());
			statement.setDouble(4, registroNota.getNotaUm());
			statement.setDouble(5, registroNota.getNotaUmRecuperacao());
			statement.setDouble(6, registroNota.getNotaDois());
			statement.setDouble(7, registroNota.getNotaDoisRecuperacao());
			statement.setDouble(8, registroNota.getMedia());
			
			int linhasAfetadas = statement.executeUpdate();
			
			if(linhasAfetadas > 0) {
				resultSet = statement.getGeneratedKeys();	
				
				if (resultSet.next()) {
					Long id = resultSet.getLong(1);
					registroNota.setId(id);
				}
			}
			else 
				throw new BancoException("Nenhuma linha afetada!");
			
		} 
		catch (SQLException exception) {
			throw new BancoException(exception.getMessage());
		} 
		finally {
			BancoJdbc.fecharConexao(conexao, statement, resultSet);
		}
	}
	public JTable pesquisar(Usuario usuario, JTable tabela) {
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {

			if(usuario != null) {
				statement = conexao.prepareStatement("select u.nome, u.matricula, m.nomemateria, rdn.ano, rdn.notaum, rdn.notaumrecuperacao, rdn.notadois, rdn.notadoisrecuperacao, rdn.mediafinal from registrodenotas rdn inner join usuario u on u.idusuario = rdn.idusuario inner join materias m on m.idmateria = rdn.idmateria where rdn.idusuario = (?);");
				statement.setLong(1, usuario.getId());
			}
			else {
				statement = conexao.prepareStatement("select u.nome, u.matricula, m.nomemateria, rdn.ano, rdn.notaum, rdn.notaumrecuperacao, rdn.notadois, rdn.notadoisrecuperacao, rdn.mediafinal from registrodenotas rdn inner join usuario u on u.idusuario = rdn.idusuario inner join materias m on m.idmateria = rdn.idmateria;");
			}
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				DefaultTableModel dtmm = (DefaultTableModel) tabela.getModel();
				dtmm.addRow(new String[] {resultSet.getString("nome"), resultSet.getString("matricula"), resultSet.getString("nomemateria"), resultSet.getString("ano"), resultSet.getString("notaum"), resultSet.getString("notaumrecuperacao"), resultSet.getString("notadois"), resultSet.getString("notadoisrecuperacao"), resultSet.getString("mediafinal") });
						}
			return tabela;
			
		} 
		catch (SQLException exception) {
			throw new BancoException(exception.getMessage());
		} 
		finally {
			BancoJdbc.fecharConexao(conexao, statement, resultSet);
		}
	}
}
