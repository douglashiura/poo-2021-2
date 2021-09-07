package com.ies.poo.screen;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen extends JFrame {
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	
	public GameScreen () {
		super("Number memory game");
		
		panel = new JPanel();
		this.add(panel);
		panel.setLayout(null);
		
		button1 = new JButton("Button1");
		panel.add(button1);
		button1.setBounds(10, 10, 100, 100);
		
		button2 = new JButton("Button2");
		panel.add(button2);
		button2.setBounds(120, 10, 100, 100);

		this.setBounds(250, 250, 350, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
