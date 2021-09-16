package testeConexaoComBancoDeDado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoComBancoDeDado {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//criarTabela();
		consultaCompletaTabela();
		consultaComFiltroTabela();
		updateCompletaTabela();
		updateComFiltroTabela();
	}
	
	public static Connection obterConexao() throws SQLException {
		
		String url = "jdbc:postgresql://127.0.0.1:5432/AulasJava";
		String usuarioDoBanco = "postgres";
		String senha = "1234567bobi";
		
		return DriverManager.getConnection(url, usuarioDoBanco, senha);
		
	}
	public static void criarTabela() throws SQLException {
		Connection conn = obterConexao();
		String instrucao = "CREATE TABLE tbl_autores (ID_Autor integer CONSTRAINT pk_id_autor PRIMARY KEY,Nome_Autor varchar(30) NOT NULL, Sobrenome_Autor varchar(40) NOT NULL,Data_Nasc date);";
		java.sql.Statement st = conn.createStatement();
		st.executeUpdate(instrucao);
		conn.close();
	}
	
	public static void consultaCompletaTabela() throws SQLException {
		Connection conn = obterConexao();
		PreparedStatement  consulta = conn.prepareStatement("Select * from tbl_autores;");
		ResultSet resultado = consulta.executeQuery();
		conn.close();
	}
	public static void consultaComFiltroTabela() throws SQLException {
		String nome = "Deiwid";
		Connection conn = obterConexao();
		PreparedStatement  consulta = conn.prepareStatement("Select * from tbl_autores where Nome_Autor like '"+ nome +"';");
		ResultSet resultado = consulta.executeQuery();
		
		conn.close();
	}
	public static void updateCompletaTabela() throws SQLException {
		Connection conn = obterConexao();
		PreparedStatement  ps = conn.prepareStatement("Update tbl_autores set Sobrenome_Autor = 'Petry';");
		ResultSet resultado = ps.executeQuery();
		conn.close();
	}
	public static void updateComFiltroTabela() throws SQLException {
		String sobrenome = "Pauli";
		Connection conn = obterConexao();
		PreparedStatement  ps = conn.prepareStatement("Update tbl_autores set Sobrenome_Autor = 'Petry' where Sobrenome_Autor like ?;");
		ps.setNString(1, sobrenome);
		ResultSet resultado = ps.executeQuery();
		
		conn.close();
	}
}
