package br.com.jswing.aulas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Aula4Boarder {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Boarder Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		Border line = BorderFactory.createLineBorder(Color.BLUE);
		JPanel panel = new JPanel();
		LayoutManager layout = new FlowLayout();
		panel.setLayout(layout);
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("Nilo Neto");
		label.setBorder(line);
		panel1.add(label);
		panel1.add(new JLabel("Ciência da Computação"));
		panel.add(panel1);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
	}

}
