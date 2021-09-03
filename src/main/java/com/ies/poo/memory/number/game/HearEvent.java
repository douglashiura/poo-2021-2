package com.ies.poo.memory.number.game;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.EventListener;

import javax.swing.JLabel;


public class HearEvent implements EventListener {
	private JLabel label;
	
	public HearEvent(JLabel label) {
		this.label = label;
	}

	public void mouseEntered(MouseEvent me) {
		label.setBackground(Color.BLACK);
	}
	
	public void mouseExited(MouseEvent me) {
		label.setBackground(new Color(255, 255, 255));
	}
}
