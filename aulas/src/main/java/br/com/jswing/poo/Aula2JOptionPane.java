package br.com.jswing.poo;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Aula2JOptionPane {

	public static void main(String[] args) {
		Object[] options = { "Sim", "Não", "É memo é?" };
		Component frame = null;
		int n = JOptionPane.showOptionDialog(frame, "Tem certeza?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

	}

}
