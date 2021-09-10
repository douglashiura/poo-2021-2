package br.ies.pooii.douglas.hiura.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoComBancoDeDados {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/saas", "comexchain",
				"comexchain");
	}

}
