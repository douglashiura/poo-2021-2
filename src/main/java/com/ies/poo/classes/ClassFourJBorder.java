package com.ies.poo.classes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class ClassFourJBorder {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Border demos");
		frame.setSize(400, 300);
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		JLabel label = new JLabel("Name");
		JLabel labelEtchedBorder = new JLabel("Etched");
		label.setLocation(150, 75);
		labelEtchedBorder.setLocation(250, 75);
		label.setSize(100, 50);
		labelEtchedBorder.setSize(100, 50);
		label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		labelEtchedBorder.setBorder(loweredetched);
		
		panel.add(label);

		panel.add(labelEtchedBorder);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
