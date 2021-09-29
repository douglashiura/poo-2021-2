package E17;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import testeConexaoComBancoDeDado.ConexaoComBancoDeDado;

public class E17 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnExcluir, btnIncluir, btnMostrar, btnSalvar;
	private JTextField texto;
	private JTable tabela;
	private int incCod = 0;

	public E17() throws SQLException{
	setTitle("Tabela");
	setSize(441,300);
	setLocation(100,50);
	Container P = getContentPane();
	P.setLayout(new BorderLayout());
	tabela = new JTable();
	tabela.setModel(new DefaultTableModel( new Object [][] { },
	new String [] { "ID", "Nome", "Sobrenome", "Valor" }));
	tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
	tabela.getColumnModel().getColumn(0).setResizable(false);
	tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
	tabela.getColumnModel().getColumn(1).setResizable(true);
	ResultSet rs = ConexaoComBancoDeDado.consultaCompletaTabelaE17();
	while (rs.next()) {
		DefaultTableModel dtmm = (DefaultTableModel) tabela.getModel();
		dtmm.addRow(new String[] {rs.getString("id"), rs.getString("nome"), rs.getString("sobrenome"), rs.getString("value") });
				}
	JScrollPane rolagemTabela = new JScrollPane(tabela);
	P.add(rolagemTabela,"Center");
	JPanel PTabSul = new JPanel();
	btnIncluir = new JButton("Incluir");
	 PTabSul.add(btnIncluir);
	btnExcluir = new JButton("Excluir");
	 PTabSul.add(btnExcluir);
	btnMostrar = new JButton("Mostrar");
	 PTabSul.add(btnMostrar);
	 btnSalvar = new JButton("Salvar");
	 PTabSul.add(btnSalvar);
	P.add(PTabSul, "South");
	btnExcluir.addActionListener(this);
	btnIncluir.addActionListener(this);
	btnMostrar.addActionListener(this);
	btnSalvar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {
		Object origem = evt.getSource();
		if (origem == btnIncluir) {
			DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
			dtm.addRow(new Object[] { Integer.valueOf(++incCod), "Cliente " + incCod });
			
		}
		if (origem == btnExcluir) {
			int linhas[] = tabela.getSelectedRows();
			DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
			for (int i = (linhas.length - 1); i >= 0; i--) {
				try {
					ConexaoComBancoDeDado.deleteE17(Integer.parseInt(tabela.getValueAt(linhas[0], 0).toString()));
				} catch (NumberFormatException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dtm.removeRow(linhas[i]);
			}
		}
		if (origem == btnMostrar) {
			if (tabela.getSelectedRow() >= 0)
				texto.setText(tabela.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn()).toString());
		}
		if (origem == btnSalvar) {
			int linhas[] = tabela.getSelectedRows();
			for (int i = (linhas.length - 1); i >= 0; i--)
				try {
					ConexaoComBancoDeDado.insertE17(tabela, linhas[i]);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

	public static void main(String args[]) throws SQLException {
		E17 fr = new E17();
		fr.setVisible(true);
	}
}
