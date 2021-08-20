package testesemaula;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InterfaceGrafica {

	public static void main(String[] args) {
		// configurações da tela principal
		JFrame frame = new JFrame("Colocar titulo da janela aqui");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500); // pixels da tela
		
		JLabel label = new JLabel("Colocar conteúdo de texto, também pode ser uma IMG pois existe construtor pra isso");
		label.setVisible(false);
		frame.getContentPane().add(label); // ??
		
		label.setBackground(Color.black);
		label.setForeground(Color.GREEN.darker()); //cor cinza escuro
		label.setOpaque(true); // mostrar ou não a cor do label
		
		
		//JOptionPane.showMessageDialog(null, label);
	}

}
