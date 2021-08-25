package aulas.bibliotecaswing.exercicios;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Exercicio0 {

public static void main(String[] args) {
		
		Object[] opcoes = {"10", "20","30", "40"}; 
		JFrame frame = new JFrame("Colocar titulo da janela aqui");
		frame.setSize(500, 500);
		
		int n =JOptionPane.showOptionDialog(frame, "Qual sua idade?", "Titulo do popup", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				opcoes, opcoes[2]);
		frame.getContentPane().add(new Label(opcoes[n].toString()));
		frame.setSize(400, 300);
		frame.setVisible(true);

	}
	
	
	
	
}
