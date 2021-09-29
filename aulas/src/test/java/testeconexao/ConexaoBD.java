package testeconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ConexaoBD {
	
	public Connection conectar() throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "3242");
	}
		
	public void cadastrarPessoa() throws SQLException {
		Connection con = conectar();
		PreparedStatement inserirPessoa = con.prepareStatement("INSERT INTO pessoa (nome) VALUES ('Trevo')");
		inserirPessoa.execute();
		inserirPessoa.close();
		con.close();
	}
	
	
	
	
	
	
	
}
	