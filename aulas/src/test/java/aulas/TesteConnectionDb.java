package aulas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteConnectionDb {
	
	public static void main(String[] arg) throws Exception{
		
		Class.forName("org.postgresql.Driver");
		
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbpoo2", "postgres", "Testando123");
		
		PreparedStatement afirmacao = conexao.prepareStatement("SELECT id_aluno, nome, idade, ctr FROM alunos"); 
		
		ResultSet resultado = afirmacao.executeQuery();
		
		while (resultado.next()) {
			
			System.out.println(resultado.getInt(1));
			System.out.println(resultado.getString(2));
			System.out.println(resultado.getInt(3));
			System.out.println(resultado.getString(4));
			
		};
		
	};

}
