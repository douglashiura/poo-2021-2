package br.com.swing.aula;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Aula2JOptionPane {

	public static void main(String[] args) {
		Object[] options = { "Sim", "Não", "É memo é?" };
		Component frame = null;
		
		@SuppressWarnings("unused")
		int n = JOptionPane.showOptionDialog(frame, "Tem certeza?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

	}

}
