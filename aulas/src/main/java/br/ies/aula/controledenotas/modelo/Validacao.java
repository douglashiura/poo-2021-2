package br.ies.aula.controledenotas.modelo;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Validacao {

	private ValidacaoBD validacao;
	public boolean validarMatricula(String matricula) {
		validacao = new ValidacaoBD();
		boolean valido = true;
		if(!validacao.validarMatricula(matricula)){
			valido = false;
		}
		return valido;
	}
	public boolean validarCombinacao(String matricula, JComboBox<?> comboBoxMaterias, JComboBox<?> comboBoxAno) {
		boolean valido = true;
		if(validacao.validarCombinacaoExistente(matricula, comboBoxMaterias, comboBoxAno)){
			valido = false;
		}
		return valido;
	}
	public boolean validarNotas(JTextField textNotaUm, JTextField textNotaUmRecuperacao, JTextField textNotaDois,
			JTextField textNotaDoisRecuperacao) {
		boolean valido = true;
		if(Float.parseFloat(textNotaUm.getText()) > 10){
			valido = false;
		}
		if(Float.parseFloat(textNotaUmRecuperacao.getText()) > 10){
			valido = false;
		}
		if(Float.parseFloat(textNotaDois.getText()) > 10){
			valido = false;
		}
		if(Float.parseFloat(textNotaDoisRecuperacao.getText()) > 10){
			valido = false;
		}
		return valido;
	}

}
