package Aulas;
import java.sql.*;
public class conexaoComBancoTerminal {
	
	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testedb", "postgres", "ma250879");
		PreparedStatement afirmacao = conexao.prepareStatement("INSERT into empresa (nome) VALUES (?);");
		ResultSet resultado = afirmacao.executeQuery();
		while (resultado.next()) {
		System.out.println(resultado.getInt(1));
		System.out.println(resultado.getString(2));
		System.out.println();
		
		}
	}
}