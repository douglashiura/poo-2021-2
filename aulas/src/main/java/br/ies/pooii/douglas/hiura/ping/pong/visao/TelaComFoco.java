package br.ies.pooii.douglas.hiura.ping.pong.visao;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TelaComFoco extends JFrame implements FocusListener {
	private static final long serialVersionUID = 1L;
	private JTextField meuNome;
	private JTextField meuSobreNome;

	public TelaComFoco() {
		super("Desenhando");
		setSize(400, 300);
		

		meuNome = new JTextField("Douglas");
		meuNome.setSize(100, 30);
		meuNome.setLocation(0, 0);
		meuNome.addFocusListener(this);

		meuSobreNome = new JTextField("Longo");
		meuSobreNome.setSize(100, 30);
		meuSobreNome.setLocation(40, 40);
		meuSobreNome.addFocusListener(this);
		getContentPane().setLayout(null);
		getContentPane().add(meuSobreNome);
		getContentPane().add(meuNome);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TelaComFoco();
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("Ola");
		meuNome.setBackground(Color.GREEN);
	}

	@Override
	public void focusLost(FocusEvent e) {
		meuNome.setBackground(Color.RED);

	}
}
