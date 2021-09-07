package com.ies.poo.classes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  

public class ClassOneJFrame {

	public static void main(String[] args) {
		   	JFrame frame = new JFrame("Memory number game");  
	        JPanel panel = new JPanel();  
	        panel.setLayout(new FlowLayout());  
	        JLabel label = new JLabel("A common button");  
	        JButton button = new JButton();  
	        button.setText("Click me");  
	        panel.add(label);
	        frame.getContentPane().add(label, BorderLayout.CENTER);  
	        frame.add(panel);  
	        frame.setSize(400, 300);  
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        frame.setVisible(true);  
	}

}
