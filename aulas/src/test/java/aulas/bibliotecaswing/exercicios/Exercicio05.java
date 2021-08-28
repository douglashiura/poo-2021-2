package aulas.bibliotecaswing.exercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio05 {

	
public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		JLabel label = new JLabel("Ronaldo");
		JLabel label2 = new JLabel("Ronaldo");
		JLabel label3 = new JLabel("Ronaldo");
		JLabel label4 = new JLabel("Ronaldo");
		
		panel.setBorder(BorderFactory.createLineBorder(Color.white, 30));
		panel2.setBorder(BorderFactory.createLineBorder(Color.white));
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel4.setBorder(BorderFactory.createLineBorder(Color.black));
		panel5.setBorder(BorderFactory.createLineBorder(Color.black));

		panel.add(panel2);
		panel.add(panel3);
		panel3.add(panel4);
		panel3.add(label);
		panel4.add(label2);
		panel5.add(label3);
		
		
		panel3.setLayout(new GridLayout(1,2));
		panel.setLayout(new GridLayout(2,1));
		panel2.setBackground(Color.red);
		panel3.setBackground(Color.DARK_GRAY);
		panel4.setBackground(Color.blue);
		panel5.setBackground(Color.GREEN);
		
		frame.getContentPane().add(panel);
		
		
		
	
}
	
}
