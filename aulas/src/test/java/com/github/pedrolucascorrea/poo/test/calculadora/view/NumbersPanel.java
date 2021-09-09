package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class NumbersPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public NumbersPanel() {
		
		JPanel numbersPanel = new JPanel();
		JButtons b = new JButtons();
		
		numbersPanel.setBackground(Color.lightGray);
		numbersPanel.add(b.button1);
		numbersPanel.add(b.button2);
		numbersPanel.add(b.button3);
		numbersPanel.add(b.sumButton);

		numbersPanel.add(b.button4);
		numbersPanel.add(b.button5);
		numbersPanel.add(b.button6);
		numbersPanel.add(b.subButton);

		numbersPanel.add(b.button7);
		numbersPanel.add(b.button8);
		numbersPanel.add(b.button9);
		numbersPanel.add(b.multButton);

		numbersPanel.add(b.button0);
		numbersPanel.add(b.dotButton);
		numbersPanel.add(b.clearButton);
		numbersPanel.add(b.divButton);

		numbersPanel.setLayout(new GridLayout(4, 4, 3, 3));

	 } 
		
	
	
	

}
