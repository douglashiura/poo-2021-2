package Aulas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class conexaoComBanco {
	
	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testedb", "postgres", "matheus25");
		PreparedStatement afirmacao = conexao.prepareStatement("INSERT into empresa (nome) VALUES (?);");
		afirmacao.setString(1, "Empresa IES");
		afirmacao.setString(2, "Estácio de Sá");
		afirmacao.setString(3, "UNISUL");
		afirmacao.execute();
	}
}