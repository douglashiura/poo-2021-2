package com.ies.poo.memory.number.game;

import javax.swing.JFrame;

public class ClassFiveWindowListener {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Janela");
		Window window = new Window();
		frame.setSize(400, 400);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(window);
		
	}

}
