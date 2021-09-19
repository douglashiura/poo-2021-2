package exerciciosBD;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	public java.sql.Connection getConexao() throws SQLException, ClassNotFoundException {
		String url = "jdbc:postgresql://172.17.0.2/docker";
		String masterUser = "docker";
		String masterKey = "1234";
		Class.forName("org.postgresql.Driver");
		System.out.println("Conectando ao Banco = " + url);
		return DriverManager.getConnection(url, masterUser, masterKey);
	}
}
