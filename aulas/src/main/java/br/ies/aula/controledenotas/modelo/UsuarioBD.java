package br.ies.aula.controledenotas.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ies.aula.controledenotas.modelo.banco.BancoException;
import br.ies.aula.controledenotas.modelo.banco.BancoJdbc;

public class UsuarioBD {

private String SQL_INSERT = "INSERT INTO public.usuario (nome, senha, matricula, tipo) VALUES (?, ?, ?, 1);";
	
	public void inserir(Usuario usuario) throws BancoException{
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
				
		try {
			statement = conexao.prepareStatement(SQL_INSERT, java.sql.Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getSenha());
			statement.setString(3, usuario.getMatricula());
			
			int linhasAfetadas = statement.executeUpdate();
			
			if(linhasAfetadas > 0) {
				resultSet = statement.getGeneratedKeys();	
				
				if (resultSet.next()) {
					Integer id = resultSet.getInt(1);
					usuario.setId(id);
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
	
	public Usuario pesquisarUsuario(String matricula) {
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = conexao.prepareStatement("SELECT * FROM public.usuario WHERE UPPER(matricula) = UPPER(?);");
			statement.setString(1, matricula);
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				Usuario aluno = instanciarUsuario(resultSet);
				return aluno;
			}
			
			return null;
			
		} 
		catch (SQLException exception) {
			throw new BancoException(exception.getMessage());
		}
		finally {
			BancoJdbc.fecharConexao(conexao, statement, resultSet);
		}
		
	}

	private Usuario instanciarUsuario(ResultSet resultSet) throws SQLException {
		Usuario usuario = new Usuario();
			
		usuario.setId(resultSet.getInt("idusuario"));
		usuario.setNome(resultSet.getString("nome"));
		usuario.setSenha(resultSet.getString("senha"));
		usuario.setMatricula(resultSet.getString("matricula"));
		usuario.setTipo(resultSet.getInt("tipo"));
			
		return usuario;
	}

}
