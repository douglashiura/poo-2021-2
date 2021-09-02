package br.ies.pooii.douglas.hiura.ping.pong.visao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaComGraficos extends JFrame {
	private static final long serialVersionUID = 1L;

	public TelaComGraficos() {
		super("Desenhando");
		setSize(400, 300);
		setVisible(true);
		JButton button = new JButton("desenho aleatorio");
		button.setSize(100,30);
		button.setLocation(0, 0);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = getGraphics();
				g.drawLine(200, 20, (int) (Math.random() * 200), 230);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(button);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.drawLine(200, 20, 250, 230);
		g.drawOval(30, 300, 20, 30);
	}

	public static void main(String[] args) {
		new TelaComGraficos();
	}
}
