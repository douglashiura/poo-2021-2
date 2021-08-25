package br.com.jswing.poo;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Aula3JOptionPaneIdade {

	public static void main(String[] args) {
		Object[] options = { "10", "20", "30", "40" };
		JFrame frame = new JFrame("Idade");
		int n = JOptionPane.showOptionDialog(frame, "Qual é sua idade?", "Selecione sua idade",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		frame.getContentPane().add(new Label(options[n].toString()));
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
}
