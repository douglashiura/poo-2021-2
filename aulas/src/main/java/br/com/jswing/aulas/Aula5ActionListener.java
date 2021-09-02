package br.com.jswing.aulas;

import java.awt.*;
import java.awt.event.*;

public class Aula5ActionListener extends Frame implements WindowListener, ActionListener {

	private static final long serialVersionUID = 1L;
	TextField text = new TextField(40);
	Button b;
	private int numClicks = 0;

	public static void main(String[] args) {
		Aula5ActionListener myWindow = new Aula5ActionListener("Aula 05 Action Listener");
		myWindow.setSize(450, 200);
		myWindow.setVisible(true);
	}

	public Aula5ActionListener(String title) {

		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		b = new Button("CLIQUE AQUI!");
		add(b);
		add(text);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		numClicks++;
		text.setText("Cliques no Botão: " + numClicks + " cliques ");
	}

	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("Janela Aberta");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("Janela Ativa");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Janela Minimizada");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("Janela Maximinizada");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("Janela Desativada");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("Janela Fechada");
	}

}
