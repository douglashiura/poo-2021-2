package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame{
	private JFrame frame;
	private ImageIcon imagem;
	private ImageIcon imagem2;
	private ImageIcon imagem3;
	private ImageIcon imagem4;
	
	
	public void iniciar() {
		frame = new TelaPrincipal();
		frame.setTitle("Titulo");
		frame.pack();
		frame.setVisible(true);
		frame.getContentPane().setLayout(new GridLayout());
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		imagem = new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\linux1.png");
		imagem2 = new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\linux2.jpeg");
		imagem3 = new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\linux3.jpg");
		imagem4 = new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\linux4.jpg");

		JLabel label = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		
		label.setIcon(imagem);
		label2.setIcon(imagem2);
		label3.setIcon(imagem3);
		label4.setIcon(imagem4);
		
		
		frame.add(label);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		
		
	}
		  
		  
}
