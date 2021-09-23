package br.com.exercicios.E18;

import javax.swing.*;
import java.sql.*;

public class CreateTableE18 extends JFrame {
	private static final long serialVersionUID = 1L;
	private Statement statment;
	private String user;
	private String driver;
	private String password;
	private String url;
	private Connection connection;
	private String connStatus;
	
	public CreateTableE18() {
		this.driver = "org.postgresql.Driver";
		this.url = "jdbc:postgresql://localhost:5432/java-bd-2";
	}

	public CreateTableE18(String user) {
		this.driver = "org.postgresql.Driver";
		this.url = "jdbc:postgresql://localhost:5432/java-bd-2";
		this.user = user;
	}
	
	public void connectToDatabase() {
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(url, user, password);
			this.connStatus = "Conectado";
		} catch(Exception e) {
			e.printStackTrace();
			this.connStatus = "Não conectado - Erro Auth";
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
		return connStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connStatus = connectionStatus;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
