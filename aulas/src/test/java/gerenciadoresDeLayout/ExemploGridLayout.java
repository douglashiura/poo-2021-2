package gerenciadoresDeLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploGridLayout {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new GridLayout(2,2));
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		JPanel painel = new JPanel();
		painel.setBackground(Color.blue);
		JPanel painel2 = new JPanel();
		painel2.setBackground(Color.yellow);
		JPanel painel3 = new JPanel();
		painel3.setBackground(Color.red);
		JPanel painel4 = new JPanel();
		painel4.setBackground(Color.green);

		frame.getContentPane().add(painel);
		frame.getContentPane().add(painel2);
		frame.getContentPane().add(painel3);
		frame.getContentPane().add(painel4);


		
	}

}
