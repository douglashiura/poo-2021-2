package aulas.bibliotecaswing.exercicios;

import java.awt.Color;

import javax.swing.JFrame;

public class TesteEx18 extends JFrame{
	private static final long serialVersionUID = 1L;
	private static Ex18 panel = new Ex18();
	
	TesteEx18(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.black);
		setSize(700, 700);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		TesteEx18 frame = new TesteEx18();
		frame.getContentPane().add(panel);
		
	}

}
