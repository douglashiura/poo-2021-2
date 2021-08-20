package com.github.pedrolucascorrea.poo.test.jaula;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialog {
	public static void main(String[] args) {
		Object[] options = { "Sim!", "Não", "Quem sabe?" };
		JFrame frame = new JFrame("Hello");

		int n = JOptionPane.showOptionDialog(frame, "Tem certeza?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		frame.getContentPane().add(new Label(options[n].toString()));
		frame.pack();
		frame.setVisible(Boolean.TRUE);
	};

};
