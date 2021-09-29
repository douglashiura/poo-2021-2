package modulo.seis.control;

public class Conexao {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Encontrado!");
		} catch (Exception ex) {
			System.out.println("Driver nao Encontrado!");
		}
	}

}
