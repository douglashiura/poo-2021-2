package modulo.seis.model;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CreateTable extends JFrame {

	private java.sql.Connection con;
	private java.sql.Statement st;
	public String valor;

	public CreateTable(String valor) {
		this.valor = valor;
		String driver = "org.postgresql.Driver";
		String usuario = "postgres";
		String senha = "anatanyuyu";
		String url = "jdbc:postgresql://localhost:5432/testConexao";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException Driver) {
			JOptionPane.showMessageDialog(null, "Driver nao localizado: " + driver);
		} catch (SQLException Fonte) {
		}

		String create = valor;

		try {
			st = con.createStatement();
			st.executeUpdate(create);
		} catch (SQLException eSQL) {
			eSQL.printStackTrace();
			System.exit(0);
		}
	}

}
