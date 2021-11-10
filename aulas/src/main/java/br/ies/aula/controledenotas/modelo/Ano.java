package br.ies.aula.controledenotas.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.ies.aula.controledenotas.modelo.banco.BancoException;
import br.ies.aula.controledenotas.modelo.banco.BancoJdbc;

public class Ano {
	public Ano() {
	}

	public static ArrayList<Integer> pesquisarAno() {
		ArrayList<Integer> anos = new ArrayList<Integer>();
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = conexao.prepareStatement("SELECT ano FROM public.ano;");
			
			resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				anos.add(resultSet.getInt("ano"));
			}
			
			return anos;
			
		} 
		catch (SQLException exception) {
			throw new BancoException(exception.getMessage());
		}
		finally {
			BancoJdbc.fecharConexao(conexao, statement, resultSet);
		}
		
	}

}
