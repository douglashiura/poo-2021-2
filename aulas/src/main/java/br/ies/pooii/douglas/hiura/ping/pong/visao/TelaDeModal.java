package br.ies.pooii.douglas.hiura.ping.pong.visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDeModal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton botao;

	public TelaDeModal() {
		super("HelloWorldSwing");
		JLabel label = new JLabel("Hello World");
		botao = new JButton("Clique aqui");
		botao.addActionListener(this);
		getContentPane().add(label);
		getContentPane().add(botao);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Apertou");
		botao.setBackground(Color.DARK_GRAY);
	}

	public static void main(String[] args) {
		new TelaDeModal();
	}
}
