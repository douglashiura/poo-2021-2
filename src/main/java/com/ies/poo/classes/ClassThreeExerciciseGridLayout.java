package com.ies.poo.classes;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClassThreeExerciciseGridLayout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Age");
		frame.setSize(600, 600);
		
		JLabel labelOne = new JLabel("Message One");
		JLabel labelTwo = new JLabel("Message Two");
		JLabel labelThree = new JLabel("Message Three");
		JLabel labelFour = new JLabel("Message Four");
		
		frame.getContentPane().setLayout(new GridLayout(2, 2));
		
		labelOne.setSize(200, 300);
		labelTwo.setSize(100, 200);
		labelThree.setSize(100, 200);
		labelFour.setSize(100, 200);
		
		frame.getContentPane().add(labelOne);
		frame.getContentPane().add(labelTwo);
		frame.getContentPane().add(labelThree);
		frame.getContentPane().add(labelFour);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
