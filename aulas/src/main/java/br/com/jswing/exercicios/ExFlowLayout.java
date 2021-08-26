package br.com.jswing.exercicios;

import java.awt.*;
import javax.swing.*;

public class ExFlowLayout {

	public static void main(String args[]) {

		JFrame frame = new JFrame();
		frame.setTitle("Flow Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 100);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		frame.add(new JButton("Botão 1"));
		frame.add(new JButton("Botão 2"));
		frame.add(new JButton("Botão 3"));
		frame.add(new JButton("Botão 4"));

		frame.setVisible(true);

	}

}