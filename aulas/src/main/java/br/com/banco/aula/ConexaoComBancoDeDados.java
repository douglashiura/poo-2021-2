package br.com.banco.aula;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoComBancoDeDados
{
	public Connection getConexao() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String masterUser = "postgres"; 
		String masterKey = "zevoadora12";
		return DriverManager.getConnection(url, masterUser, masterKey);
	}
	
	public void inserirAluno(Aluno aluno) throws SQLException, IOException {		
		Connection conexao = getConexao();
		PreparedStatement afirmacao = conexao.prepareStatement("INSERT INTO faculdade.aluno (id, nome, curso) VALUES (?, ?, ?);");
		afirmacao.setInt(1, aluno.getId());
		afirmacao.setString(2, aluno.getNome());
		afirmacao.setString(3, aluno.getCurso());
		afirmacao.execute();
		afirmacao.close();
		conexao.close();		
	}
	
	public void selecionarAlunos() throws SQLException, IOException {		
		Connection conexao = getConexao();
		Statement afirmacao = conexao.createStatement();
		ResultSet retorno = afirmacao.executeQuery("SELECT id, nome, curso FROM faculdade.aluno;");
		
		while (retorno.next()) {
	         System.out.println(retorno.getInt("id"));
	         System.out.println(retorno.getString("nome"));
	         System.out.println(retorno.getString("curso"));
	    }
		
		afirmacao.close();
		conexao.close();		
	}
	
	public void selecionarAlunoEspecifico(Aluno aluno) throws SQLException, IOException {		
		Connection conexao = getConexao();
		PreparedStatement afirmacao = conexao.prepareStatement("SELECT id, nome, curso FROM faculdade.aluno WHERE id = (?);");
		
		afirmacao.setInt(1, aluno.getId());
		afirmacao.execute();
		
		ResultSet retorno = afirmacao.getResultSet();
		retorno.next();
        System.out.println(retorno.getInt("id"));
        System.out.println(retorno.getString("nome"));
        System.out.println(retorno.getString("curso"));
		
		afirmacao.close();
		conexao.close();		
	}

}
