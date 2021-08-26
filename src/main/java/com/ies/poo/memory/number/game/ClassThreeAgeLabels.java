package com.ies.poo.memory.number.game;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClassThreeAgeLabels {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Age");
		frame.setSize(600, 600);
		
		JLabel labelOne = new JLabel("Message One");
		JLabel labelTwo = new JLabel("Message Two");
		JLabel labelThree = new JLabel("Message Three");
		JLabel labelFour = new JLabel("Message Four");
		JLabel labelFive = new JLabel("Message Five");
		JLabel labelSix = new JLabel("Message Six");
		
		frame.getContentPane().setLayout(null);
		
		labelOne.setLocation(10, 20);
		labelOne.setSize(200, 300);
		
		labelTwo.setLocation(200, 300);
		labelTwo.setSize(100, 200);
		labelThree.setSize(100, 200);
		
		
		
		frame.getContentPane().add(labelOne);
		frame.getContentPane().add(labelTwo);
		frame.getContentPane().add(labelThree);
		frame.getContentPane().add(labelFour);
		frame.getContentPane().add(labelFive);
		frame.getContentPane().add(labelSix);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		for (int i = 0; i < 10000; i++) {
			labelThree.setLocation(10, i);
			Thread.sleep(10);
		}

	}

}
