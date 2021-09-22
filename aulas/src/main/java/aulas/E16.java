package aulas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.*;
import java.awt.*;

public class E16 extends JFrame implements ActionListener {

	private JButton btnExcluir, btnIncluir, btnMostrar;
	private JTextField texto;
	private JTable tabela;
	private int incCod = 0;

	public E16() {
		setTitle("Tabela");
		setSize(441, 300);
		setLocation(100, 50);
		setResizable(false);
		Container P = getContentPane();
		P.setLayout(new BorderLayout());
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Nome", "Sobrenome", "Valor" }));

		tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
		tabela.getColumnModel().getColumn(0).setResizable(false);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setResizable(true);
		JScrollPane rolagemTabela = new JScrollPane(tabela, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		P.add(rolagemTabela, "Center");

		JPanel PTabSul = new JPanel();
		btnIncluir = new JButton("Incluir");
		PTabSul.add(btnIncluir);
		btnIncluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnIncluir.setBackground(Color.white);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnIncluir.setBackground(Color.yellow);  
			}
		});
		
		btnExcluir = new JButton("Excluir");
		PTabSul.add(btnExcluir);
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnExcluir.setBackground(Color.white);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExcluir.setBackground(Color.cyan);  
			}
		});
		
		btnMostrar = new JButton("Mostrar");
		PTabSul.add(btnMostrar);
		btnMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnMostrar.setBackground(Color.white);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMostrar.setBackground(Color.red);  
			}
		});
		
		texto = new JTextField("Nome Selecionado");
		PTabSul.add(texto);
		P.add(PTabSul, "South");
		texto.setEditable(false);
		btnExcluir.addActionListener(this);
		btnIncluir.addActionListener(this);
		btnMostrar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {

		Object origem = evt.getSource();
		if (origem == btnIncluir) {
			DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
			dtm.addRow(new Object[] { new Integer(++incCod), "Cliente " + incCod });
			
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

	public static void main(String args[]) {
		E16 fr = new E16();
		fr.setVisible(true);
	}
}
