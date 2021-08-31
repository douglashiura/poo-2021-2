package testeJOptionPane;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Deiwid Petry");
		frame.setSize(800, 500);
		
		JLabel labelUm = new JLabel("1");
		JLabel labelDois = new JLabel("2");
		JLabel labelTres = new JLabel("3");
		JLabel labelQuatro = new JLabel("4");
		
		frame.getContentPane().setLayout(new GridLayout(2, 2));
		
		labelUm.setSize(100, 200);
		labelDois.setSize(100, 200);
		labelTres.setSize(100, 200);
		labelQuatro.setSize(100, 200);
		
		frame.getContentPane().add(labelUm);
		frame.getContentPane().add(labelDois);
		frame.getContentPane().add(labelTres);
		frame.getContentPane().add(labelQuatro);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
