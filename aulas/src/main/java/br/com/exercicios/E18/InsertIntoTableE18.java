package br.com.exercicios.E18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoTableE18 {
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection connection;
	private Statement statement;
	
	public InsertIntoTableE18() {
		this.driver = "org.postgresql.Driver";
		this.url = "jdbc:postgresql://localhost:5432/faculdadejava";
	}
	
	public void insertIntoDatabase(String user, String password, String tableName, String columnName, String dataType) {
		try {
			Class.forName(driver);
			this.user = user;
			this.password = password;
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			statement = connection.createStatement();
			System.out.println("ALTER TABLE " + tableName
					+ " ADD COLUMN " + columnName + " " + dataType + " constraint;");
			statement.executeUpdate("ALTER TABLE " + tableName
					+ " ADD COLUMN " + columnName + " " + dataType + ";");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
