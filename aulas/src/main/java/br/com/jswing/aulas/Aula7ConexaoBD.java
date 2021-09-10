package br.com.jswing.aulas;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class Aula7ConexaoBD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Connection conexao = DriverManager.getConnection("");
		

	}

}
