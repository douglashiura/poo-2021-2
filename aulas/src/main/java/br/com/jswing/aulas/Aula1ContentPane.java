package br.com.jswing.aulas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aula1ContentPane {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Teste");
		JLabel label = new JLabel("Teste II");
		frame.getContentPane().add(label, BorderLayout.CENTER);
	}
}