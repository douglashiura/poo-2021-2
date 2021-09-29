package aulas.bibliotecaswing.exercicios;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//exercício03: montar 5 labels dentro de um frame para gerenciá-los dentro de um tipo de layout.

public class Ex03 {
	
	
	public static void main(String[] args) {
	
	JFrame janela = new JFrame("Titulo da janela aqui");
	janela.getContentPane().setBackground(Color.black);
	janela.setSize(600, 600);
	janela.setVisible(true);
	
	//janela.getContentPane().setLayout(new GridLayout(2,3));
	janela.getContentPane().setLayout(new GridLayout());
	
	JLabel label = new JLabel("Mensagem");
	JLabel label2 = new JLabel("Mensagem2");
	JLabel label3 = new JLabel("Mensagem3");
	JLabel label4 = new JLabel("Mensagem4");
	JLabel label5 = new JLabel("Mensagem5");
	
	janela.getContentPane().add(label);
	janela.getContentPane().add(label2);	
	janela.getContentPane().add(label3);
	janela.getContentPane().add(label4);
	janela.getContentPane().add(label5);
	
	
	}
	
	
}
