package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NumbersPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumbersPanel() {
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");

		JButton dotButton = new JButton(".");
		JButton sumButton = new JButton("+");
		JButton subButton = new JButton("-");
		JButton multButton = new JButton("*");
		JButton divButton = new JButton("/");
		JButton clearButton = new JButton("C");
		
		this.setBackground(Color.lightGray);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(sumButton);

		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(subButton);

		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(multButton);

		this.add(button0);
		this.add(dotButton);
		this.add(clearButton);
		this.add(divButton);

		this.setLayout(new GridLayout(4, 4, 3, 3));
	}
	
	
}
