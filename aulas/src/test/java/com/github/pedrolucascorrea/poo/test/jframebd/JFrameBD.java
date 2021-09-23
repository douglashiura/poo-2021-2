package com.github.pedrolucascorrea.poo.test.jframebd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;

public class JFrameBD extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFrameBD() {
		this.setTitle("Wizard para cricao de tabelas de BD");
	}
	
	public static Connection conectarBanco() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "adminadmin");
	}

}
