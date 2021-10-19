package br.ies.aula.controledenotas.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JComboBox;

import br.ies.aula.controledenotas.banco.BancoException;
import br.ies.aula.controledenotas.banco.BancoJdbc;

public class MateriaBD {
	
	public MateriaBD() {
	}

	public Vector<Materia> pesquisarMateria() {
		Vector<Materia> materias = new Vector<Materia>();
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = conexao.prepareStatement("SELECT idMateria, nomeMateria FROM public.materia;");
			
			resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				materias.addElement(new Materia(resultSet.getInt("idMateria"), resultSet.getString("nomeMateria")));
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
