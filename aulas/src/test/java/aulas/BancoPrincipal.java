package aulas;

import java.sql.ResultSet;

public class BancoPrincipal {

	public static void main(String[] args) {

		Conexao con = new Conexao();

		String sql = "INSERT INTO pessoa (id, nome, sexo) VALUES (default, 'Maria', 'F')";
		String sqlprint = "SELECT nome, sexo from pessoa";

		int res = con.executaSQL(sql);

		if (res > 0) {

			System.out.println("Cadastrado com Sucesso!");
		} else {

			System.out.println("Erro ao Cadastrar!!");
		}

		String valor = "SELECT * FROM pessoa";

		ResultSet rs = con.executaBusca(valor);

		try {
			while (rs.next()) {

				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String sexo = rs.getString("sexo");

				System.out.println(id + " - " + nome + " - " + sexo);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
