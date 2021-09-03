package com.ies.poo.memory.number.game;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ClassFiveWindowListener {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Janela");
		Window window = new Window(frame);
		
		JButton button = new JButton("Apertou-me");
		JLabel label = new JLabel("Luiz Fernando de Morais");
		JTextField textField = new JTextField("Luiz Fernando de Morais");
		TextField textField2 = new TextField("Flamengo");
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
		textField2.setSize(100, 100);
		textField2.setLocation(100, 100);
		textField2.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				System.out.println(e.toString());
				textField2.setText("vasco");
			}
			
		});
		textField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.setLayout(null);
		frame.setSize(400, 400);
		//frame.getContentPane().add(button);
		//frame.getContentPane().add(label);
		//frame.getContentPane().add(textField);
		frame.getContentPane().add(textField2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(window);
		button.addActionListener(new HearAction(button));
		textField.addFocusListener(new CheckFocus(textField));
	}

}
