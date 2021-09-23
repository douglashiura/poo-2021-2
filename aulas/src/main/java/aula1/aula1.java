package aula1;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;

public class aula1 {


	 public static void main(String[] args) {
		  JFrame janela = new JFrame();
		  JLabel label = new JLabel("Vamo");
		  janela.getContentPane().add(label, BorderLayout.CENTER);
		  janela.setSize(300,200);
		  janela.setVisible(true);

	 	}
	 }
