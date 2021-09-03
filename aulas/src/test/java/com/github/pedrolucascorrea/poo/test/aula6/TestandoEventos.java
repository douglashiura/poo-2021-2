package com.github.pedrolucascorrea.poo.test.aula6;

import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JFrame;

public class TestandoEventos {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		TextField textField = new TextField("testando aqui");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(textField);
		frame.setVisible(true);
		
		textField.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				textField.setText("testado");
				System.out.println("Tecla apertada");
				
			}
		});
			
		}
		
	}

