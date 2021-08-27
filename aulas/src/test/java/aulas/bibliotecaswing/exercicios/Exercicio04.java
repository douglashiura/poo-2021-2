package aulas.bibliotecaswing.exercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio04 {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.pack();
		frame.setSize(500, 500);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setOpaque(true);
		panel.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("Ronaldo");
		panel.add(label);
		
		
		
		
	}
	
	
}
