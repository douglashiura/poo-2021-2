package br.ies.aula.controledenotas.modelo;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;


public class ControleDeNotas {

	
	private RegistroNota registroNota;
	public ControleDeNotas(RegistroNota registroNota) {
		this.setRegistroNota(registroNota);
		
	}
	public ControleDeNotas() {
	}
	public double calculoMedia(JTextField textNotaUm, JTextField textNotaUmRecuperacao, JTextField textNotaDois, JTextField textNotaDoisRecuperacao) {
		double media = 0;
		double maiorPrimeiraNota = (Double.parseDouble(textNotaUm.getText()) >= Double.parseDouble(textNotaUmRecuperacao.getText()) ? Double.parseDouble(textNotaUm.getText()) : Double.parseDouble(textNotaUmRecuperacao.getText()));
		double maiorSegundaNota = (Double.parseDouble(textNotaDois.getText()) >= Double.parseDouble(textNotaDoisRecuperacao.getText()) ? Double.parseDouble(textNotaDois.getText()) : Double.parseDouble(textNotaDoisRecuperacao.getText()));
		double soma = maiorPrimeiraNota + maiorSegundaNota;
		media = soma / 2;
		return media;
	}
	public RegistroNota getRegistroNota() {
		return registroNota;
	}
	public void setRegistroNota(RegistroNota registroNota) {
		this.registroNota = registroNota;
	}
	
	public void inserirRegistroNota(RegistroNota registroNota) {
		
		RegistroNotaBD registroDeNotaBD = new RegistroNotaBD();
		registroDeNotaBD.inserir(registroNota);
	}
	
}
