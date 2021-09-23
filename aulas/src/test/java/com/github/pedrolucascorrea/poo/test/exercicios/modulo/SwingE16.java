package com.github.pedrolucascorrea.poo.test.exercicios.modulo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class SwingE16 extends JFrame implements ActionListener {

	private JTable tabela;
	private JTextField texto;
	private JButton incluirButton, excluirButton, mostrarButton;
	private int incCod = 0;

	public SwingE16() {
		
		setTitle("Tabela");
		setSize(600, 400);
		setLocation(100, 50);
		Container P = getContentPane();
		P.setLayout(new BorderLayout());
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(new Object[][][][]{}, new String[] { "ID", "Nome", "Sobrenome", "Valor"}));

		tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
		tabela.getColumnModel().getColumn(0).setResizable(false);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setResizable(true);

		JScrollPane scroll = new JScrollPane(tabela);
		P.add(scroll, "Center");

		JPanel panelInferior = new JPanel();
		incluirButton = new JButton("Incluir");
		excluirButton = new JButton("Excluir");
		mostrarButton = new JButton("Mostrar");

		panelInferior.add(incluirButton);
		panelInferior.add(excluirButton);
		panelInferior.add(mostrarButton);

		texto = new JTextField("Nome Selecionado");

		panelInferior.add(texto);
		P.add(panelInferior, "South");

		incluirButton.addActionListener(this);
		excluirButton.addActionListener(this);
		mostrarButton.addActionListener(this);

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent evt) {
		Object origem = evt.getSource();
		if (origem == incluirButton) {
			DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
			dtm.addRow(new Object[] { new Integer(++incCod), "Cliente " + incCod});
			tabela.setBackground(Color.green);
		}
		if (origem == excluirButton) {
			int linhas[] = tabela.getSelectedRows();
			DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
			for (int i = (linhas.length - 1); i >= 0; i--)
				dtm.removeRow(linhas[i]);
			tabela.setBackground(Color.cyan);

		}
		if (origem == mostrarButton) {
			if (tabela.getSelectedRow() >= 0)
				texto.setText(tabela.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn()).toString());
			tabela.setBackground(Color.orange);

		}

	}

	public static void main(String[] args) {
		SwingE16 swing = new SwingE16();
		swing.setVisible(true);
	}

}
