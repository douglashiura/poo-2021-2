package com.github.pedrolucascorrea.poo.test.aula5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TesteEventos {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		//final JLabel label = new JLabel("Hello World");
		//JButton button = new JButton("Clique aqui");]
		JTextField myName = new JTextField("Pedro Lucas");	
		JTextField lalala = new JTextField("LALALALALA");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(myName);
		frame.getContentPane().add(lalala);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		lalala.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				lalala.setBackground(Color.lightGray);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				lalala.setBackground(Color.green);
				
			}
		});
		myName.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				myName.setBackground(Color.cyan);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				myName.setBackground(Color.orange);
				
			}
		});
		
		/*button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botao Apertado");

			}
		});*/
		
		/*frame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("Janela Aberta");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Fechando Janela");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("Janela Fechada");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});*/
		
	}
}
