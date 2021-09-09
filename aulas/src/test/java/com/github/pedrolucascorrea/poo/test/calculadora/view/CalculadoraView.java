package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;

public class CalculadoraView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MainPanel panel;

	public CalculadoraView() {
		JFrame frame = new JFrame();

		frame.getContentPane().add(panel);

		frame.setTitle("Calculadora");

		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				titleAlign(frame);
			}
		});

		frame.setSize(350, 500);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		CalculadoraView frame = new CalculadoraView();
		frame.setVisible(true);

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