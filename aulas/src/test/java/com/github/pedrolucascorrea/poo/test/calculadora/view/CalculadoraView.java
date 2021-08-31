package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculadoraView extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JLabel label1 = new JLabel("testando");
		frame.getContentPane().add(label1);
		
		//Configurações do frame
		frame.setTitle("Calculadora");
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				titleAlign(frame);
			}
		});

		frame.setSize(350,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Centralização do Titulo
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