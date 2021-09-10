package com.github.pedrolucascorrea.poo.test.conexaoBD;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","adminadmin");
	}

}
