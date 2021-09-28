package exercicios;

import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.*;

public class Ex20_InserirDados extends JFrame {
	private Connection con;
	private Statement st;

	public Ex20_InserirDados() throws SQLException {
		String driver = "org.postgresql.Driver";
		String sUsuario = "postgres";
		String sSenha = "1234";
		String sFonte = "jdbc:postgresql://localhost:5432/postgres";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(sFonte, sUsuario, sSenha);
			JOptionPane.showMessageDialog(this, "Banco conectado com sucesso!", "Mensagem",
					JOptionPane.WARNING_MESSAGE);
		} catch (SQLException eSQL) {
			// exceçõesdeSQL
			eSQL.printStackTrace();
			JOptionPane.showMessageDialog(this, "Falha na conexão com o banco!\n" + "Mensagem: " + eSQL.getMessage(),
					"Erro", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// demaisexceções
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Falha na conexão com o banco!\n" + "Mensagem: " + e.getMessage(),
					"Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	System.exit(0);
	}try{
	// criastatement paraconsultarbancodedados
	st=con.createStatement();
	// Cadastrodevalorespre-definidos
	st.executeUpdate("INSERT INTO tabela1 values(1,'Joao');");}catch(

	SQLException eSQL)
	{
		JOptionPane.showMessageDialog(this, "Erro na expressão do INSERT!\n" + "Mensagem: " + eSQL.getMessage(), "Erro",
				JOptionPane.ERROR_MESSAGE);
		System.exit(1);
	}try
	{
		st.close();
		con.close();
	}catch(
	Exception exception)
	{
		exception.printStackTrace();
		System.exit(2);
	}
	Container P = getContentPane();P.setLayout(new FlowLayout());
	JLabel mensagem = new JLabel("Você acabou de testar um exemplo usando INSERT!");P.add(mensagem);
	}public static void main(String args[]) throws SQLException{
						Ex20_InserirDados ex = new Ex20_InserirDados();
						ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
						ex.setVisible(true);
						ex.setTitle("USANDO INSERT");
						ex.setSize(400,200);
						}
}}