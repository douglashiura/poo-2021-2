package testesemaula;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InterfaceGrafica {

	public static void main(String[] args) {
		// configura��es da tela principal
		JFrame frame = new JFrame("Colocar titulo da janela aqui");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500); // pixels da tela
		
		JLabel label = new JLabel("Colocar conte�do de texto, tamb�m pode ser uma IMG pois existe construtor pra isso");
		label.setVisible(false);
		frame.getContentPane().add(label); // ??
		
		label.setBackground(Color.black);
		label.setForeground(Color.GREEN.darker()); //cor cinza escuro
		label.setOpaque(true); // mostrar ou n�o a cor do label
		
		
		//JOptionPane.showMessageDialog(null, label);
	}

}
