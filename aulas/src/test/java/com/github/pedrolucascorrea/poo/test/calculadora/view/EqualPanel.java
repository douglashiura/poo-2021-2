package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class EqualPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EqualPanel() {
		JButtons b = new JButtons();
		JPanel equalPanel = new JPanel();
		
		equalPanel.setLayout(new FlowLayout());
		// equalPanel.setPreferredSize(new Dimension(350, 75));
		// equalPanel.setMaximumSize(new Dimension(350, 75));
		
		equalPanel.add(b.equalButton);
	}
	
}
