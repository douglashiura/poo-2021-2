package tec.nnilux.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {

	private Connection connection;

	public ConexaoBD() {

	}

	public void connectToDatabase() {
		try {
			Class.forName("org.postgresql.Driver");
			this.connection = (Connection) DriverManager.getConnection("jdbc:postgresql://172.17.0.2/docker", "docker",
					"1234");
			System.out.println("Conectado");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
