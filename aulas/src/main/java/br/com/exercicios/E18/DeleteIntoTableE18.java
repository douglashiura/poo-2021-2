package br.com.exercicios.E18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteIntoTableE18 {
	private String driver;
	private String fonte;
	private Connection connection;
	private Statement statement;
	
	public DeleteIntoTableE18() {
		this.driver = "org.postgresql.Driver";
		this.fonte = "jdbc:postgresql://localhost:5432/faculdadejava";
	}
	
	public void deleteIntoDatabase(String user, String password, String tableName, String columnName) {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(fonte, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			statement = connection.createStatement();
			System.out.println("ALTER TABLE " + tableName
					+ " DROP COLUMN " + columnName + ";");
			statement.executeUpdate("ALTER TABLE " + tableName
					+ " DROP COLUMN " + columnName + ";");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
