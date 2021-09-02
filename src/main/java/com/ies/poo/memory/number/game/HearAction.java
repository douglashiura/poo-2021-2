package com.ies.poo.memory.number.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class HearAction implements ActionListener {
	private JButton button;
	
	public HearAction(JButton button) {
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Apertou me");
		
	}

}
