package tec.nnilux.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class ConexaoBD {

	public Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

		}

		try {
			conn = (Connection) DriverManager.getConnection("jdbc://localhost:3306/ti", "root", null);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);

		}
		return conn;
	}

}
