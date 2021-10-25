package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculadoraView extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		// Panels
		JPanel screenPanel = new JPanel();
		JPanel numbersPanel = new JPanel();
		JPanel equalPanel = new JPanel();

		// Botoes
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");

		JButton dotButton = new JButton(".");
		JButton sumButton = new JButton("+");
		JButton subButton = new JButton("-");
		JButton multButton = new JButton("*");
		JButton divButton = new JButton("/");
		JButton clearButton = new JButton("C");

		JButton equalButton = new JButton("=");

		button1.setBackground(Color.cyan);

		// Configuração screenPanel
		screenPanel.setBackground(Color.lightGray);

		// Configuração numbersPanel
		numbersPanel.setBackground(Color.lightGray);
		numbersPanel.add(button1);
		numbersPanel.add(button2);
		numbersPanel.add(button3);
		numbersPanel.add(sumButton);

		numbersPanel.add(button4);
		numbersPanel.add(button5);
		numbersPanel.add(button6);
		numbersPanel.add(subButton);

		numbersPanel.add(button7);
		numbersPanel.add(button8);
		numbersPanel.add(button9);
		numbersPanel.add(multButton);

		numbersPanel.add(button0);
		numbersPanel.add(dotButton);
		numbersPanel.add(clearButton);
		numbersPanel.add(divButton);

		numbersPanel.setLayout(new GridLayout(4, 4));

		// Configuração equalPanel
		equalPanel.add(equalButton);

		// Configurações do frame
		frame.setLayout(new GridLayout(3, 1));
		frame.getContentPane().add(screenPanel);
		frame.getContentPane().add(numbersPanel);
		frame.getContentPane().add(equalPanel);
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