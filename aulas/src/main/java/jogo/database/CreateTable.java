package jogo.database;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class CreateTable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection con;
	private Statement st;
	
	public CreateTable() {
		String driver = "org.postgresql.Driver";
		String sUsuario = "postgres";
		String sSenha = "postgre";
		String sFonte = "jdbc:postgresql://localhost:5432/postgres";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(sFonte, sUsuario, sSenha);
			JOptionPane.showMessageDialog(this, 
					"Banco conectado com sucesso!",
					"Mensagem", JOptionPane.WARNING_MESSAGE);
		}
		
		catch(SQLException eSQL) {
			// Exce��es de SQL
			eSQL.printStackTrace();
			JOptionPane.showMessageDialog(this, 
					"Falha na conex�o com o banco \n" +
					"Mensagem: " + eSQL.getMessage(),
					"Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		catch(Exception e) {
			// Demais exce��es
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, 
					"Falha na conex�o com o banco! \n" +
					"Mensagem: " + e.getMessage(),
					"Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		
		String sentencaSQL = "CREATE TABLE tabela1 (codigo integer PRIMARY KEY, nome VARCHAR(50));";
		
		try {
			st = con.createStatement();
			st.executeUpdate(sentencaSQL);
			JOptionPane.showMessageDialog(this, 
					"Tabela criada com sucesso!",
					"Mensagem", JOptionPane.WARNING_MESSAGE);
		}
		
		catch(SQLException eSQL) {
			eSQL.printStackTrace();
			JOptionPane.showMessageDialog(this, 
					"N�o foi poss�vel criar a tabela! \n" +
					"Mensagem: " + eSQL.getMessage(),
					"Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(2);
		}
		
		try {
			st.close();
			con.close();
		}
		
		catch(Exception exception) {
			exception.printStackTrace();
			System.exit(3);
		}
		
		Container P = getContentPane();
		P.setLayout(new FlowLayout());
		JLabel mensagem = new JLabel("Voc� acabou de testar um exemplo usando CREATE TABLE!");
		P.add(mensagem);
	}
	
	public static void main(String[] args) {
		CreateTable ex = new CreateTable();
		ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ex.setTitle("Usando CREATE TABLE");
		ex.setVisible(true);
		ex.setSize(400, 300);
	}
}
