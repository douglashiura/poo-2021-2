package br.ies.aula.controledenotas.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ies.aula.controledenotas.banco.BancoException;
import br.ies.aula.controledenotas.banco.BancoJdbc;
import br.ies.aula.controledenotas.entidade.EntidadeAluno;

public class AlunoBD {

private String SQL_INSERT = "INSERT INTO public.usuario (nome, senha, matricula, tipo) VALUES (?, ?, ?, 1);";
	
	public void inserir(EntidadeAluno aluno) throws BancoException{
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
				
		try {
			statement = conexao.prepareStatement(SQL_INSERT, java.sql.Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getSenha());
			statement.setString(3, aluno.getMatricula());
			
			int linhasAfetadas = statement.executeUpdate();
			
			if(linhasAfetadas > 0) {
				resultSet = statement.getGeneratedKeys();	
				
				if (resultSet.next()) {
					Long id = resultSet.getLong(1);
					aluno.setId(id);
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
	
	public Aluno pesquisarAluno(String matricula) {
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = conexao.prepareStatement("SELECT * FROM public.usuario WHERE UPPER(matricula) = UPPER(?);");
			statement.setString(1, matricula);
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				Aluno aluno = instanciarAluno(resultSet);
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

	private Aluno instanciarAluno(ResultSet resultSet) throws SQLException {
		Aluno aluno = new Aluno();
			
		aluno.setId(resultSet.getLong("id"));
		aluno.setNome(resultSet.getString("nome"));
		aluno.setSenha(resultSet.getString("senha"));
		aluno.setMatricula(resultSet.getString("matricula"));
			
		return aluno;
	}

}
