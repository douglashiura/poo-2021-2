package br.ies.pooii.douglas.hiura.ping.pong.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaComEtiqueQueMudaDeCor extends JFrame implements MouseListener {
	private static final long serialVersionUID = 1L;
	private JLabel meuNome;

	public TelaComEtiqueQueMudaDeCor() {
		super("Desenhando");
		setSize(400, 300);

		meuNome = new JLabel("Douglas");
		meuNome.setSize(100, 30);
		meuNome.setOpaque(true);
		meuNome.setLocation(0, 0);
		meuNome.addMouseListener(this);

		getContentPane().setLayout(null);
		getContentPane().add(meuNome);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TelaComEtiqueQueMudaDeCor();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("ok");
		meuNome.setForeground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		meuNome.setForeground(Color.black);
	}

}
