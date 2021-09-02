package com.ies.poo.memory.number.game;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CheckFocus implements FocusListener {
	private JTextField textField;
	
	public CheckFocus(JTextField textField) {
		this.textField = textField;
	}
	

	@Override
	public void focusGained(FocusEvent e) {
		textField.setBackground(Color.GREEN);
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		textField.setBackground(Color.WHITE);
		
	}

	
}
