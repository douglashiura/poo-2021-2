package aulas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JPanel {
	 public static void main(String[] args) {
		  JFrame janela = new JFrame("Qualquer um");
		  JLabel label = new JLabel("Vamo");
		  label.setVisible(false);
		  janela.getContentPane().add(label, BorderLayout.CENTER);
		  janela.pack();
		  janela.setVisible(true);
	 	}
}
