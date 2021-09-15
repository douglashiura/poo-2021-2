package testeConexaoComBancoDeDado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoComBancoDeDado {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = obterConexao();
	}
	
	public static Connection obterConexao() throws SQLException {
		
		String url = "jdbc:postgresql://127.0.0.1:5432/AulasJava";
		String usuarioDoBanco = "postgres";
		String senha = "1234567bobi";
		
		return DriverManager.getConnection(url, usuarioDoBanco, senha);
		
	}
}
