package com.ies.poo.memory.number.game;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClassFiveWindowListener {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Janela");
		Window window = new Window(frame);
		
		JButton button = new JButton("Apertou-me");
		JLabel label = new JLabel("Luiz Fernando de Morais");
		JTextField textField = new JTextField("Luiz Fernando de Morais");
		label.setSize(200, 200);
		label.setLocation(100, 100);
		label.setOpaque(true);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				label.setBackground(Color.BLACK);
			}
			public void mouseExited(MouseEvent me) {
				label.setBackground(new Color(255, 255, 255));
			}
		});
		button.setLocation(20, 20);
		button.setSize(100, 100);
		textField.setSize(100, 100);
		textField.setLocation(300, 300);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);
		frame.getContentPane().add(textField);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(window);
		button.addActionListener(new HearAction(button));
		textField.addFocusListener(new CheckFocus(textField));
	}

}
