package aulas;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;

public class TestJOptionPane {

	public static void main(String arg[]) {

		// JOptionPane.showInputDialog(null, "Olaaaa");

		JFrame janela = new JFrame("Testando");
		janela.setSize(300, 200);
		janela.setVisible(true);
		janela.setTitle("Titulo Testando");
		janela.setBackground(Color.green);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel texto = new JLabel("Outro teste");
		janela.getContentPane().add(texto);
		
		janela.setVisible(false);
		
	}
}
