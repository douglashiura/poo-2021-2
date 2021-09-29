package aula;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex18_ConexaoDB {
	private static Connection con;

	public static void main(String[] args) {
		
		String driver = "org.postgresql.Driver";
		String user = "postgres";
		String senha = "Aizen789@";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		
		try {
			Class.forName(driver);
			Connection con= null; 
			
			
			con = (Connection) DriverManager.getConnection(url, user, senha);
			
			System.out.println("Conexão realizada com sucesso.");
		}
		
		catch (ClassNotFoundException ex) {
			System.err.println(ex.getMessage());
		}
		
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}