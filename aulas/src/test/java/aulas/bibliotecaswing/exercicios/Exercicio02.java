package aulas.bibliotecaswing.exercicios;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Exercicio02 {

public static void main(String[] args) {
		
		
		JPanel painel = new JPanel();
		painel.setBackground(Color.black);
		painel.setOpaque(true);
		
		JFrame janela = new JFrame("Titulo da janela aqui");
		janela.getContentPane().add(painel);	
		janela.setSize(600, 600);
		janela.setVisible(true);
		
		Object[] opcoes = {"10", "20","30", "40"};
		
		int n =JOptionPane.showOptionDialog(painel, "Qual sua idade?", "Titulo do modal", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);
		JLabel label = new JLabel(opcoes[n].toString());
		
		label.setVisible(true);
		painel.add(label);
		
	}
	
	
	
	
}
