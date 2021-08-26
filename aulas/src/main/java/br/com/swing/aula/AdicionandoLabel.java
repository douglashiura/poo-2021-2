package br.com.swing.aula;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdicionandoLabel {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Titulo da janela aqui");
				
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
		
		janela.setLayout(new GridLayout(3, 3));
		
		janela.setSize(200, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

