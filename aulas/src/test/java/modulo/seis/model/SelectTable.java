package modulo.seis.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SelectTable extends JFrame {

	private java.sql.Connection con;
	private java.sql.Statement st;
	public String valor;

	public SelectTable(String valor) {
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

		String select = valor;

		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(select);

			while (rs.next()) {

				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				System.out.println(id + " - " + nome);
			
			}

		} catch (SQLException eSQL) {
			eSQL.printStackTrace();
			System.exit(0);
		}
	}

}
