package aula;

import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.*;


public class E18_ApagarDados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID1 = 1L;

	/**
	 * 
	 */
	private static final long serialVersionUID = -7225908320079963865L;

	private Connection con;

	private Statement st;

public E18_ApagarDados() throws SQLException {
	String driver   = "org.postgresql.Driver"; 
    String sFonte = "jdbc:postgresql://localhost:5432/postgres";
    String sUsuario = "root";
    String sSenha = "Aizen789@";
    
    try {
    	Class.forName(driver);
        con = DriverManager.getConnection(sFonte, sUsuario, sSenha);
        JOptionPane.showMessageDialog(this,
		"Banco conectado com sucesso!",
        "Mensagem", JOptionPane.WARNING_MESSAGE);
        
 }catch (SQLException eSQL) {
// exceções de SQL
       eSQL.printStackTrace();
       JOptionPane.showMessageDialog(this,
       "Falha na conexão com o banco!\n" +
       "Mensagem: " + eSQL.getMessage(),
       "Erro", JOptionPane.ERROR_MESSAGE);
}catch (Exception e) {
// demais exceções
       e.printStackTrace();
       JOptionPane.showMessageDialog(this,
       "Falha na conexão com o banco!\n" +
       "Mensagem: " + e.getMessage(),
       "Erro", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        
    }
    
    try {
    	st= con.createStatement();
    	String ExecutaDelete= "DELETE FROM tabela1 WHERE codigo=1";
    	st.execute (ExecutaDelete);
    	
    }
    catch(SQLException eSQL){
    	JOptionPane.showMessageDialog(this,
    	"Erro na expressão do DELETE!\n" +
    	"Mensagem: " + eSQL.getMessage(),
    	"Erro", JOptionPane.ERROR_MESSAGE);
    	System.exit(2);
    	}
    	
    try {
    	st.close();
    	con.close();
    	}
    catch(Exception exception){
    	exception.printStackTrace();
    	System.exit(3);
    	}
    
    	Container P = getContentPane();
    	P.setLayout(new FlowLayout());
    	JLabel mensagem = new JLabel("Você acabou de testar um exemplo usando DELETE");
    	P.add(mensagem);
    	}

    	public static void main(String args[]) throws SQLException{
    	E18_ApagarDados ex = new E18_ApagarDados ();
    	ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	ex.setVisible(true);
    	ex.setTitle("USANDO DELETE");
    	ex.setSize(400,200);
    	}
    	}

    


