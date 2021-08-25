package aulas;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;

public class TestJOptionPane {

	public static void main(String arg[]) {

		// JOptionPane.showInputDialog(null, "Olaaaa");

		JFrame janela = new JFrame();
		janela.setSize(300, 200);
		janela.setVisible(true);
		janela.setTitle(" Jogo da Mtm ");
		janela.getContentPane().setBackground(Color.LIGHT_GRAY);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel texto = new JLabel("Outro teste");
		janela.getContentPane().add(texto);

		// texto.setVisible(false);

	}
}
