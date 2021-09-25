package exerciciosBD;

import java.beans.Statement;
import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

public class ConexaoBDTable {
	private java.sql.Statement statment;
	private String user;
	private String driver;
	private int password;
	private String fonte;
	private java.sql.Connection connection;
	private String connectionStatus;

	public ConexaoBDTable() {
		this.driver = "org.postgresql.Driver";
		this.fonte = "jdbc:postgresql://172.17.0.2/docker";
	}

	public ConexaoBDTable(String docker) {
		this.driver = "org.postgresql.Driver";
		this.fonte = "jdbc:postgresql://172.17.0.2/docker";
		this.user = docker;
	}

	public void connectToDatabase() {
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(fonte);
			this.connectionStatus = "Conectado";
		} catch (Exception e) {
			e.printStackTrace();
			this.connectionStatus = "Não conectado - Erro Auth";
		}
	}

	public void desconnectFromDatabase() {
		try {
			Class.forName(driver);
			setConnectionStatus("Não conectado");
			statment = connection.createStatement();
			statment.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createDatabaseTable(String tableName) {
		if (tableName == null) {
			return;
		}

		String sentenceSQL = "CREATE TABLE " + tableName + " (codigo integer PRIMARY KEY , nome VARCHAR(50));";
		try {
			statment = connection.createStatement();
			statment.executeUpdate(sentenceSQL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createDatabaseBySQL(String sentenceSQL) {
		try {
			statment = connection.createStatement();
			statment.executeUpdate(sentenceSQL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setUser(String user) {
		System.out.println(user);
		System.out.println("chamou");
		this.user = user;
	}

	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = 1234;
	}
}