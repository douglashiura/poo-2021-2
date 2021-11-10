package br.ies.aula.controledenotas.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JComboBox;

import br.ies.aula.controledenotas.modelo.banco.BancoException;
import br.ies.aula.controledenotas.modelo.banco.BancoJdbc;

public class ValidacaoBD {

	public boolean validarMatricula(String matricula) {
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = conexao.prepareStatement("SELECT matricula FROM public.usuario where UPPER(matricula) = UPPER(?);");
			statement.setString(1, matricula);
			resultSet = statement.executeQuery();
			
			return resultSet.next();
			
		} 
		catch (SQLException exception) {
			throw new BancoException(exception.getMessage());
		}
		finally {
			BancoJdbc.fecharConexao(conexao, statement, resultSet);
		}
		
	}

	public boolean validarCombinacaoExistente(String matricula, JComboBox<?> comboBoxMaterias, JComboBox<?> comboBoxAno) {
		Connection conexao = BancoJdbc.obterConexao();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			StringTokenizer materia = new StringTokenizer(comboBoxMaterias.getSelectedItem().toString());
			statement = conexao.prepareStatement("select rdn.idusuario from registrodenotas rdn inner join usuario u on u.idusuario = rdn.idusuario where u.matricula = (?) and rdn.ano = (?) and rdn.idmateria = (?);");
			statement.setString(1, matricula);
			statement.setInt(2, Integer.parseInt(comboBoxAno.getSelectedItem().toString()));
			statement.setInt(3, Integer.parseInt(materia.nextToken("-")));
			resultSet = statement.executeQuery();
			
			return resultSet.next();
			
		} 
		catch (SQLException exception) {
			throw new BancoException(exception.getMessage());
		}
		finally {
			BancoJdbc.fecharConexao(conexao, statement, resultSet);
		}
	}
	
}
