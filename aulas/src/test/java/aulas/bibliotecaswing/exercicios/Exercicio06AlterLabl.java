package aulas.bibliotecaswing.exercicios;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercicio06AlterLabl extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JLabel l;

	public Exercicio06AlterLabl() {
		super("Desenhando");
		setSize(400, 300);

		l = new JLabel("Alter color");
		l.setSize(100, 30);
		l.setOpaque(true);
		l.setLocation(0, 0);
		l.addMouseListener((MouseListener) l);

		getContentPane().setLayout(null);
		getContentPane().add(l);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercicio06AlterLabl();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("ok");
		l.setForeground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		l.setForeground(Color.black);

	}
}