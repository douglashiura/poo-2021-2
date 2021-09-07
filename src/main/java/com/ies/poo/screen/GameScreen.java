package com.ies.poo.screen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				((JButton)	e.getSource()).setBackground(Color.BLUE);;
				
			}
			
		});
		
		button2 = new JButton("Button2");
		panel.add(button2);
		button2.setBounds(120, 10, 100, 100);

		this.setBounds(250, 250, 350, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
