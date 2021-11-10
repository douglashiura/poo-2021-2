package br.ies.aula.controledenotas.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JComboBox;

import br.ies.aula.controledenotas.modelo.banco.BancoException;
import br.ies.aula.controledenotas.modelo.banco.BancoJdbc;

public class MateriaBD {
	
	public MateriaBD() {
	}

	public ArrayList<String> pesquisarMateria() {
		ArrayList<String> materias = new ArrayList<String>();
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = conexao.prepareStatement("SELECT idmateria, nomemateria FROM public.materias;");
			
			resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				materias.add(resultSet.getInt("idmateria")+"-"+resultSet.getString("nomemateria"));
			}
			
			return materias;
			
		} 
		catch (SQLException exception) {
			throw new BancoException(exception.getMessage());
		}
		finally {
			BancoJdbc.fecharConexao(conexao, statement, resultSet);
		}
		
	}
}
