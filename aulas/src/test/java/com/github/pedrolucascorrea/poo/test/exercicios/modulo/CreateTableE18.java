package com.github.pedrolucascorrea.poo.test.exercicios.modulo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableE18 {
	private Statement statment;
	private String user;
	private String driver;
	private String password;
	private String fonte;
	private Connection connection;
	private String connectionStatus;
	
	public CreateTableE18() {
		this.driver = "org.postgresql.Driver";
		this.fonte = "jdbc:postgresql://localhost:5432/java-bd-2";
	}

	public CreateTableE18(String user) {
		this.driver = "org.postgresql.Driver";
		this.fonte = "jdbc:postgresql://localhost:5432/java-bd-2";
		this.user = user;
	}
	
	public void connectToDatabase() {
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(fonte, user, password);
			this.connectionStatus = "Conectado";
		} catch(Exception e) {
			e.printStackTrace();
			this.connectionStatus = "Auth ERROR";
		}
	}
	
	public void desconnectFromDatabase() {
		try {
			Class.forName(driver);
			setConnectionStatus("Não conectado");
			statment = connection.createStatement();
			statment.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createDatabaseTable(String tableName) {
		if(tableName == null) {
			return;
		}
		
		String sentenceSQL = "CREATE TABLE " + tableName + " (codigo serial PRIMARY KEY , nome VARCHAR(50));";
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
		System.out.println("Usuario conectado");
		this.user = user;
	}
	
	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}