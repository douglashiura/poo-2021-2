package aulas.bibliotecaswing.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexaoBD {

	public void main() throws ClassNotFoundException, SQLException { 
				
			Class.forName("org.postgresql.Driver");
			Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5433/APS", "postgres", "3242");
			PreparedStatement afirmacao = conexao.prepareStatement("Select * from jogador");
			ResultSet resultado = afirmacao.executeQuery();
			
			while (resultado.next()) {
				System.out.print("oi");


				
				
			}
			
					   
					   
			   
			   
					   
				   
			   }
			
			
		
	}
	