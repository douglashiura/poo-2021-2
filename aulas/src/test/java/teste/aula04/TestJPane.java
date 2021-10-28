package teste.aula04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class TestJPane {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Border Test");
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("Lucas");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel21 = new JPanel();
		JPanel panel22 = new JPanel();
		
		contentPane.add(panel1, BorderLayout.PAGE_START);
		contentPane.add(panel2, BorderLayout.PAGE_END);
		panel1.add(label);
		panel2.add(panel21);
		panel2.add(panel22);
		
		label.setBorder(BorderFactory.createLineBorder(Color.blue));
		panel1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		panel2.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		panel21.setBorder(BorderFactory.createLineBorder(Color.yellow, 2));
		panel22.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
