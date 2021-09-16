package com.github.pedrolucascorrea.poo.test.conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		updateTable();
	}

	public static Connection conectarBanco() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "adminadmin");
	}

	public static void createTable() throws ClassNotFoundException, SQLException {
		Connection c = conectarBanco();
		Statement stmt = c.createStatement();
		String instrucao = "CREATE TABLE funcionarios (  id serial primary key, nome varchar (255))";
		stmt.executeUpdate(instrucao);
		c.close();
	}

	public static void insertInto() throws ClassNotFoundException, SQLException {
		Connection c = conectarBanco();
		PreparedStatement inserirNome = c.prepareStatement("INSERT into funcionarios(nome) values ('Daniel')");
		inserirNome.executeUpdate();
		c.close();
	}

	public static void selectFrom() throws ClassNotFoundException, SQLException {
		Connection c = conectarBanco();
		PreparedStatement consulta = c.prepareStatement("Select id, nome FROM funcionarios");
		ResultSet result = consulta.executeQuery();
		while (result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println();
		}
		c.close();
	}

	public static void selectFromWhere() throws ClassNotFoundException, SQLException {
		Connection c = conectarBanco();
		PreparedStatement consultaFiltro = c.prepareStatement("Select * FROM funcionarios where nome = 'Daniel';");
		ResultSet result = consultaFiltro.executeQuery();

		while (result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println();
		}
		c.close();
	}

	public static void updateTable() throws ClassNotFoundException, SQLException {
		Connection c = conectarBanco();
		PreparedStatement update = c.prepareStatement("Update funcionarios set nome = 'João' where nome = 'Kleber'");
		update.executeUpdate();
		c.close();

	}
}
