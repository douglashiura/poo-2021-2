package com.github.pedrolucascorrea.poo.test.exercicios.modulo;

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

public class SwingE17 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SwingE17() {
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		JTabbedPane tabbedPane = new JTabbedPane();
		JLabel nameLabel = new JLabel("Nome: ", SwingConstants.CENTER);
		JLabel addressLabel = new JLabel("Endereço: ", SwingConstants.CENTER);
		
		//Dados Pessoais
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel1);
		panel1.setBackground(Color.GREEN);
		panel1.add(nameLabel);
		
		JTextField nome = new JTextField();
		panel1.add(nome);

		JTextField address = new JTextField();
		panel1.add(addressLabel);
		panel1.add(address);
		panel1.setLayout(new GridLayout(8, 2));
		
		//Emprego
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		tabbedPane.addTab("Emprego", null, panel2);
		panel2.setLayout(new GridLayout(8, 2));

		JLabel label2 = new JLabel("Empresa: ", SwingConstants.CENTER);
		panel2.add(label2);
		
		JTextField empresa = new JTextField();
		panel2.add(empresa);

		JLabel label3 = new JLabel("Funcao: ", SwingConstants.CENTER);
		panel2.add(label3);
		
		JTextField funcao = new JTextField();
		panel2.add(funcao);

		//Relatorio
		JLabel label4 = new JLabel();
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		panel3.setLayout(new BorderLayout());
		panel3.add(new JButton("Alterar dados pessoais"), BorderLayout.NORTH);
		panel3.add(new JButton("Alterar dados de emprego"), BorderLayout.NORTH);
		panel3.add(new JButton("Gerar relatório"), BorderLayout.NORTH);
		panel3.add(label4, BorderLayout.CENTER);
		tabbedPane.addTab("Relatório", null, panel3);
		panel3.setLayout(new GridLayout(5, 2));
		add(tabbedPane);
	}

	public static void main(String args[]) {
		SwingE17 tabbedPaneFrame = new SwingE17();
		tabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabbedPaneFrame.setSize(600, 300);
		tabbedPaneFrame.setVisible(true);
	}
}