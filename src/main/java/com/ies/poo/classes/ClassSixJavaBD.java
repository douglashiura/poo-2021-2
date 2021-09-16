package com.ies.poo.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClassSixJavaBD {
	static String driverJDBC = "org.postgresql.Driver";
	static String url = "jdbc:postgresql://localhost:5432/java-bd-2";
	static String usuario = "postgres";
	static String senha = "postgres";

	public static void main(String[] args) {
		Connection conexao = null;
		Connection con = conexao;
		Statement statement = null;
		ResultSet result = null;
		String instrucaoSQL = "Select * from alunos";
		try {
			Class.forName(driverJDBC);
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Consultando os dados na tabela");
			statement = conexao.createStatement();
			result = statement.executeQuery(instrucaoSQL);
			while(result.next()) {
				System.out.println("+-----------------------------+");
				System.out.println("Matricula......: " + result.getString(1));
				System.out.println("Nome......: " + result.getString(2));
				System.out.println("Email......: " + result.getString(3));
				System.out.println("Idade......: " + result.getString(4));
			}
		} catch (Exception e) {
			System.out.println("Erro");
			e.printStackTrace();
		}

	}

}
