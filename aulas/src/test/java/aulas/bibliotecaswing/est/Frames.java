package aulas.bibliotecaswing.est;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Frames extends JFrame{
	public Frames() {
		super();
		janela();
	}
	
	
	
	
	
	public static void main(String[] args) {
		

		JFrame telaPrincipal = new JFrame("Colocar titulo da janela aqui");
		JPanel container1 = new JPanel();
		JLabel label = new JLabel("Texto, ou img, etc");
		JButton botao = new JButton("Clique aqui");
		// configuracoes Frame
		telaPrincipal.setVisible(true);
		telaPrincipal.setSize(700, 700);
		telaPrincipal.getContentPane().add(container1);
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// configuracoes Container1
		container1.setSize(200, 200);
		container1.add(label);
		container1.add(botao);
		container1.setVisible(true);
		
		// configurações Label
		label.setVisible(true);
		label.setSize(700, 700);
		label.setBackground(Color.black);
		label.setForeground(Color.GREEN.darker()); // cor letra;
		label.setOpaque(true); // default background
		
		// configurações Button
		botao.setVisible(false);
		botao.setSize(50, 50);

		
		

		
		

	}

	
	public void janela() {
		
		
		
	}
	
	
	
}
