package com.ies.poo.memory.number.game;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ClassThreeAge {

	public static void main(String[] args) {
		Object[] options = { "< 10", "< 20", "< 30", "< 40", "> 41" };
		JFrame frame = new JFrame("Age frame");
		int optionIndex = JOptionPane.showOptionDialog(frame, 
				"Select your age from the options below", 
				"Confirm", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, options, null);
		frame.getContentPane().add(new Label(options[optionIndex].toString()));
		frame.getContentPane().add(new JLabel("Texto 1"));
		frame.getContentPane().add(new JLabel("Texto 2"));
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
