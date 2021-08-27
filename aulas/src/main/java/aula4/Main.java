package aula4;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JLabel meuNome = new JLabel("Carlos Eduardo Fernandes Davila");
		JLabel nomeMae = new JLabel("Cristiane");
		JLabel NomePai = new JLabel("Carlos");
		GridLayout gridLayout1 = new GridLayout(2, 1);
		GridLayout gridLayout2 = new GridLayout(1, 2);
		
		frame.setSize(400,400);
		frame.getContentPane().setLayout(gridLayout1);
		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		panel1.setBackground(Color.CYAN);
		panel1.add(meuNome);
		panel1.setBorder(BorderFactory.createLineBorder(Color.yellow));
		
		panel2.setLayout(gridLayout2);
		panel2.setBackground(Color.yellow);
		panel2.add(panel3);
		panel2.add(panel4);
		panel2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel3.setBackground(Color.CYAN);
		panel3.add(nomeMae);
		panel4.setBackground(Color.yellow);
		panel4.add(NomePai);
		frame.setVisible(true);
	}

}
