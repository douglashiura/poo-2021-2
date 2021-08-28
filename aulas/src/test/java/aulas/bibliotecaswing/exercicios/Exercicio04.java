package aulas.bibliotecaswing.exercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// bordas do jPanel
public class Exercicio04 {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setBorder(BorderFactory.createLineBorder(Color.magenta));
		JLabel label = new JLabel("Ronaldo");
		frame.getContentPane().add(panel);
		
		
		panel.add(label);
		
		
		
		
	}
	
	
}
