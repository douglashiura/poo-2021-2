package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MainPanel {
	
	public MainPanel() {
		NumbersPanel np = new NumbersPanel();
		ScreenPanel sp = new ScreenPanel();
		EqualPanel ep = new EqualPanel();
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 15));
		mainPanel.setBackground(Color.LIGHT_GRAY);
		
		mainPanel.add(sp);
		mainPanel.add(np);
		mainPanel.add(ep);
		mainPanel.setLayout(new GridLayout(3, 1));
	}
}
