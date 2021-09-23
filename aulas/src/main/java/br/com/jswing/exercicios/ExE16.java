package br.com.jswing.exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*; 
import java.awt.*; 
import java.awt.event.*;

public class ExE16 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnExcluir, btnIncluir, btnMostrar;
	private JTextField texto;
	private JTable tabela;
	private int incCod = 0;

	public ExE16() {
		setTitle("Tabela");
		setSize(441, 300);
		setLocation(100, 50);
		Container P = getContentPane();
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Nome" }));

		tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
		tabela.getColumnModel().getColumn(0).setResizable(false);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setResizable(true);

		JScrollPane rolagemTabela = new JScrollPane(tabela);
		P.add(rolagemTabela, "Center");

		JPanel PTabSul = new JPanel();
		btnIncluir = new JButton("Incluir");
		PTabSul.add(btnIncluir);
		btnExcluir = new JButton("Excluir");
		PTabSul.add(btnExcluir);
		btnMostrar = new JButton("Mostrar");
		PTabSul.add(btnMostrar);
		texto = new JTextField("Nome Selecionado");
		PTabSul.add(texto);
		P.add(PTabSul, "South");
		btnExcluir.addActionListener(this);
		btnIncluir.addActionListener(this);
		btnMostrar.addActionListener(this);
	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent evt) {
		Object origem = evt.getSource();
		if (origem == btnIncluir) {
			DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
			dtm.addRow(new Object[] { new Integer(++incCod), " Cliente " + incCod });
		}

		if (origem == btnExcluir) {
			int linhas[] = tabela.getSelectedRows();
			DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
			for (int i = (linhas.length - 1); i >= 0; i--)
				dtm.removeRow(linhas[i]);
		}

		if (origem == btnMostrar) {
			if (tabela.getSelectedRow() >= 0)
				texto.setText(tabela.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn()).toString());
		}
	}
	
	public static void main (String args[]){
		ExE16 fr = new ExE16();
		fr.setVisible(true);
	}
}
