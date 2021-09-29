package modulo.seis.control;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class ConexaoBanco {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String usuario = "postgres";
		String senha = "Testando123";
		String url = "jdbc:postgresql://localhost:5432/moduloSeisJava";
		try {
			Class.forName(driver);
			Connection con = null;
			con = (Connection) DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão Bem sucedida!");
		} catch (ClassNotFoundException ex) {
			System.err.print(ex.getMessage());
		} catch (SQLException e) {
			System.err.print(e.getMessage());
		}
	}
}
