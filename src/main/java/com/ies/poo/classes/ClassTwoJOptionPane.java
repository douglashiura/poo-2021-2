package com.ies.poo.classes;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClassTwoJOptionPane {

	public static void main(String[] args) {
		Object[] options = { "Sim", "Não", "Talvez" };
		JFrame frame = new JFrame("Frame title");
		int n = JOptionPane.showOptionDialog(frame, "Selecione uma das opções", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, null);
		
		frame.getContentPane().add(new Label(options[n].toString()));
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
}
