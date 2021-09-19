package br.com.jswing.aulas;

public class Aula7ConexaoBD {

	static String driverJDBC = "org.postgresql.Driver";

	public static void main(String[] args) {

		try {
			System.out.println("Carregando Driver JDBC...");
			Class.forName(driverJDBC);
			System.out.println("Driver carregado com sucesso!");
		} catch (Exception e) {
			System.out.println("Falha no carregamento do Driver");
		}

	}

}
