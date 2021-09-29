// NOMES: LUIZ FERNANDO E NILO J COELHO NETO

package br.com.jswing.exercicios.exsliderdemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class OvalPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private int diameter = 10;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter);
	}

	public void setDiameter(int newDiameter) {

		diameter = (newDiameter >= 0 ? newDiameter : 10);
		repaint();
	}

	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}

	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
}
