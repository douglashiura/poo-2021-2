package br.com.jswing.exercicios;

import static javax.swing.SwingConstants.CENTER;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ExE16 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExE16() {
		super("JTabbedPane Demo ");

		JTabbedPane tabbedPane = new JTabbedPane();
		JLabel labelNome = new JLabel("Nome: ", SwingConstants.CENTER);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		panel1.add(labelNome);
		tabbedPane.addTab("Dados Pessoais", null, panel1, "Primeiro Panel");
		
		JTextField nome = new JTextField(20);
		panel1.add(nome);
	
		
		JLabel label2 = new JLabel("Emprego", SwingConstants.CENTER);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		panel2.add(label2);
		tabbedPane.addTab("Emprego", null, panel2, "Segundo Panel");

		JLabel label3 = new JLabel();
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		panel3.setLayout(new BorderLayout());
		panel3.add(new JButton("Alterar Dados Pessoais"), BorderLayout.NORTH);
		//panel3.add(new JButton("West"), BorderLayout.WEST);
		//panel3.add(new JButton("East"), BorderLayout.EAST);
		//panel3.add(new JButton("South"), BorderLayout.SOUTH);
		panel3.add(label3, BorderLayout.CENTER);
		tabbedPane.addTab("Relatório", null, panel3, "Terceiro Panel");
		add(tabbedPane);
	}

	public static void main(String args[]) {
		ExE16 tabbedPaneFrame = new ExE16();
		tabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabbedPaneFrame.setSize(500, 350);
		tabbedPaneFrame.setVisible(true);
	}
}
