package br.com.jswing.exercicios;

import java.beans.Statement;
import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

public class ExE18 {

	private Statement statment;
	private String user;
	private String driver;
	private String password;
	private String fonte;
	private Connection connection;
	private String connectionStatus;

	public ExE18() {
		this.driver = "org.postgresql.Driver";
		this.password = "1234";
		this.fonte = "jdbc:postgresql://localhost:5432/java-bd-2";
	}

	public ExE18(String user) {
		this.driver = "org.postgresql.Driver";
		this.password = "postgres";
		this.fonte = "jdbc:postgresql://localhost:5432/java-bd-2";
		this.user = user;
	}

	public void connectToDatabase() {
		try {
			Class.forName(driver);
			this.connection = (Connection) DriverManager.getConnection(fonte, user, password);
			this.connectionStatus = "Conectado";
		} catch (Exception e) {
			e.printStackTrace();
			this.connectionStatus = "Não conectado! Erro de Autenticação!";
		}
	}

	public void desconnectFromDatabase() {
		try {
			Class.forName(driver);
			setConnectionStatus("Não conectado");
			statment = (Statement) ((java.sql.Connection) connection).createStatement();
			Object clone = statment.clone();
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
			statment = (Statement) ((java.sql.Connection) connection).createStatement();
			((java.sql.Statement) statment).executeUpdate(sentenceSQL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createDatabaseBySQL(String sentenceSQL) {
		try {
			statment = (Statement) ((java.sql.Connection) connection).createStatement();
			((java.sql.Statement) statment).executeUpdate(sentenceSQL);
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
}
