package br.ies.poo.deiwid.petry.jogo.par.impar.main.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoComBancoDeDados {

	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/saas", "comexchain",
				"comexchain");
		PreparedStatement afirmacao = conexao.prepareStatement("SELECT id, nome FROM Empresa WHERE id>?");
		afirmacao.setInt(1, 1);
		ResultSet resultado = afirmacao.executeQuery();
		while (resultado.next()) {
			System.out.println(resultado.getInt(1));
			System.out.println(resultado.getString(2));
			System.out.println();
		}

	}

}
