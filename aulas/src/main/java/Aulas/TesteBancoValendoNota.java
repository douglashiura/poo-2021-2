package Aulas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBancoValendoNota {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		sequelConsult();
		sequelWithFilter();
	}

	public static Connection makeConnectiob() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/testedb";
		String user = "postgres";
		String senha = "matheus25";
		return DriverManager.getConnection(url, user, senha);

	}

	public static void makeTable() throws SQLException {
		Connection conn = makeConnectiob();
		String sequel = "CREATE TABLE empresa (Id integer CONSTRAINT pk_id PRIMARY KEY,Funcionario varchar(150) NOT NULL,Setor varchar(40) NOT NULL,Funcao varchar(30);";
		java.sql.Statement st = conn.createStatement();
		st.executeUpdate(sequel);
		conn.close();
	}

	public static void sequelConsult() throws SQLException {
		Connection conn = makeConnectiob();
		PreparedStatement consult = conn.prepareStatement("Select * from empresa;");
		consult.executeQuery();
		conn.close();
	}

	public static void sequelWithFilter() throws SQLException {
		String Funcionario = "Matheus";
		Connection conn = makeConnectiob();
		PreparedStatement consult = conn
				.prepareStatement("Select * from empresa where Setor like '" + Funcionario + "';");
		consult.executeQuery();
		conn.close();
	}
}