package aulas.bibliotecaswing.exercicios;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

//exercício03: montar 5 labels dentro de um frame.

public class Exercicio03 {
	
	
	public static void main(String[] args) {
	
	JFrame janela = new JFrame("Titulo da janela aqui");
	janela.setSize(600, 600);
	janela.setVisible(true);
	janela.setBackground(Color.black);
	
	JLabel label = new JLabel("Mensagem");
	JLabel label2 = new JLabel("Mensagem2");
	JLabel label3 = new JLabel("Mensagem3");
	janela.getContentPane().add(label);
	janela.getContentPane().add(label2);	
	janela.getContentPane().add(label3).setBackground(Color.black);
	
	
	}
	
	
}
