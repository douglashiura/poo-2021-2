package gerenciadoresDeLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploBorderLayout {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new BorderLayout());
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
		JPanel painel5 = new JPanel();
		painel5.setBackground(Color.darkGray);
		

		frame.getContentPane().add(painel, BorderLayout.NORTH);
		frame.getContentPane().add(painel2, BorderLayout.SOUTH);
		frame.getContentPane().add(painel3, BorderLayout.EAST);
		frame.getContentPane().add(painel4, BorderLayout.WEST);
		frame.getContentPane().add(painel5, BorderLayout.CENTER);

		
		frame.revalidate();
	}
}
