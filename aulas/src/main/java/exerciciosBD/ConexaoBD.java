package exerciciosBD;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class ConexaoBD {

	static String driverJDBC = "org.postgresql.Driver";
	static String url = "jdbc:postgresql://172.17.0.2/docker";
	static String masterUser = "docker";
	static String masterKey = "1234";

	public static void main(String args[]) {

		try {
			System.out.println("Carregando Driver...");
			Class.forName(driverJDBC);
			System.out.println("Driver carregado com sucesso!");
		} catch (Exception e) {
			System.out.println("Falha ao carregar o Driver JDBC");
		}

		try {
			System.out.println("Conectando ao Banco...");
			System.out.println("Conexão efetuada com sucesso!");
		} catch (Exception e) {
			System.out.println("Falha na conexão com o banco!");
		}
	}
}
