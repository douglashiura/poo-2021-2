package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculadoraView {

	public static void main(String[] args) {
		
		// Main
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel();
		JButtons b = new JButtons();

		// Configuração screenPanel
		JPanel screenPanel = new JPanel();

		screenPanel.setBackground(Color.green);

		// Configuração numbersPanel
		JPanel numbersPanel = new JPanel();
		
		numbersPanel.setBackground(Color.lightGray);
		numbersPanel.add(b.button1);
		numbersPanel.add(b.button2);
		numbersPanel.add(b.button3);
		numbersPanel.add(b.sumButton);

		numbersPanel.add(b.button4);
		numbersPanel.add(b.button5);
		numbersPanel.add(b.button6);
		numbersPanel.add(b.subButton);

		numbersPanel.add(b.button7);
		numbersPanel.add(b.button8);
		numbersPanel.add(b.button9);
		numbersPanel.add(b.multButton);

		numbersPanel.add(b.button0);
		numbersPanel.add(b.dotButton);
		numbersPanel.add(b.clearButton);
		numbersPanel.add(b.divButton);

		numbersPanel.setLayout(new GridLayout(4, 4, 3, 3));

		// Configuração equalPanel
		JPanel equalPanel = new JPanel();
		equalPanel.setLayout(new FlowLayout());
		//equalPanel.setPreferredSize(new Dimension(350, 75));
		//equalPanel.setMaximumSize(new Dimension(350, 75));

		JButton equalButton = new JButton("=");
		//equalButton.setPreferredSize(new Dimension(350, 75));
		equalPanel.add(equalButton);

		// Configurações gerais
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 15));
		mainPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(screenPanel);
		mainPanel.add(numbersPanel);
		mainPanel.add(equalPanel);
		mainPanel.setLayout(new GridLayout(3,1));

		frame.getContentPane().add(mainPanel);

		frame.setTitle("Calculadora");
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				titleAlign(frame);
			}
		});

		frame.setSize(350, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Centralização do Titulo
	private static void titleAlign(JFrame frame) {

		Font font = frame.getFont();

		String currentTitle = frame.getTitle().trim();
		FontMetrics fm = frame.getFontMetrics(font);
		int frameWidth = frame.getWidth();
		int titleWidth = fm.stringWidth(currentTitle);
		int spaceWidth = fm.stringWidth(" ");
		int centerPos = (frameWidth / 2) - (titleWidth / 2);
		int spaceCount = centerPos / spaceWidth;
		String pad = "";
		// for (int i=0; i!=w; i++) pad +=" ";
		pad = String.format("%" + (spaceCount - 14) + "s", pad);
		frame.setTitle(pad + currentTitle);

	}
}