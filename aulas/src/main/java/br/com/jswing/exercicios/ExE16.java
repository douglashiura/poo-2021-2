package br.com.jswing.exercicios;

import java.awt.BorderLayout;
import java.awt.Color;
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
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		JTabbedPane tabbedPane = new JTabbedPane();
		JLabel labelNome = new JLabel("Nome: ", SwingConstants.CENTER);
		JLabel labelEndereco = new JLabel("Endereço: ", SwingConstants.CENTER);

		JPanel panel1 = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel1, "Primeiro Panel");
		panel1.setBackground(Color.GREEN);
		panel1.add(labelNome);
		
		JTextField nome = new JTextField();
		panel1.add(nome);

		JTextField endereco = new JTextField();
		panel1.add(labelEndereco);
		panel1.add(endereco);
		panel1.setLayout(new GridLayout(8, 2));

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		tabbedPane.addTab("Emprego", null, panel2, "Segundo Panel");
		panel2.setLayout(new GridLayout(8, 2));

		JLabel label2 = new JLabel("Empresa: ", SwingConstants.CENTER);
		panel2.add(label2);
		JTextField empresa = new JTextField();
		panel2.add(empresa);

		JLabel label3 = new JLabel("Funcao: ", SwingConstants.CENTER);
		panel2.add(label3);
		JTextField funcao = new JTextField();
		panel2.add(funcao);

		JLabel label4 = new JLabel();
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		panel3.setLayout(new BorderLayout());
		panel3.add(new JButton("Alterar dados pessoais"), BorderLayout.NORTH);
		panel3.add(new JButton("Alterar dados de emprego"), BorderLayout.NORTH);
		panel3.add(new JButton("Gerar relatório"), BorderLayout.NORTH);
		panel3.add(label4, BorderLayout.CENTER);
		tabbedPane.addTab("Relatório", null, panel3, "Terceiro Panel");
		panel3.setLayout(new GridLayout(5, 2));
		add(tabbedPane);
	}

	public static void main(String args[]) {
		ExE16 tabbedPaneFrame = new ExE16();
		tabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabbedPaneFrame.setSize(500, 350);
		tabbedPaneFrame.setVisible(true);
	}
}
