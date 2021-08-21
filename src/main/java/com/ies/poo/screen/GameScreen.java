package com.ies.poo.screen;

import javax.swing.JFrame;

public class GameScreen extends JFrame {
	public GameScreen () {
		super("Number memory game");

		this.setBounds(250, 250, 350, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
