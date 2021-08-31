package br.ies.aula.controledenotas.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.sun.jdi.connect.spi.Connection;

import br.ies.aula.controledenotas.Nota;
import br.ies.aula.controledenotas.banco.BancoException;
import br.ies.aula.controledenotas.banco.BancoJdbc;
import br.ies.aula.controledenotas.entidade.EntidadeAluno;

public class Aluno {
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private int matricula;
	private List<Nota> lstNotas;
	
	public Aluno() {
	}

	public Aluno(String nome, String login, String senha, int matricula) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.matricula = matricula;
	}

	private static final String SQL_INSERT = "INSERT INTO aluno (nome, login, senha, matricula) VALUES (?, ?, ?, ?);";
	
	public void inserir(EntidadeAluno aluno) {
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
				
		try {
			statement = conexao.prepareStatement(SQL_INSERT, java.sql.Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getLogin());
			statement.setString(3, aluno.getSenha());
			statement.setString(4, aluno.getMatricula());
			
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
	
	public Aluno pesquisarAluno(String login) {
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = conexao.prepareStatement("SELECT * FROM aluno WHERE UPPER(login) = UPPER(?);");
			statement.setString(1, login);
			
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
		aluno.setLogin(resultSet.getString("login"));
		aluno.setSenha(resultSet.getString("senha"));
			
		return aluno;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public  List<Nota> getLstNotas() {
		return lstNotas;
	}

	public void setLstNotas(List<Nota> lstNotas) {
		this.lstNotas = lstNotas;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
