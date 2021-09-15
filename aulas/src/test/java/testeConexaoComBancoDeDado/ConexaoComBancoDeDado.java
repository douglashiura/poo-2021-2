package testeConexaoComBancoDeDado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoComBancoDeDado {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		criarTabela();
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
}
