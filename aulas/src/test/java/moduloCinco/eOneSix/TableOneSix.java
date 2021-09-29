package moduloCinco.eOneSix;

import java.awt.BorderLayout;
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

public class TableOneSix extends JFrame implements ActionListener {

	private JButton buttonDelete, buttonInclude, buttonShow;
	private JTextField text;
	private JTable table;
	private int incCod = 0;

	public TableOneSix() {

		setTitle("Table");
		setSize(441, 300);
		setLocation(100, 50);
		Container p = getContentPane();
		p.setLayout(new BorderLayout());
		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Name" }));

		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(1).setResizable(true);

		JScrollPane scrollingTable = new JScrollPane(table);
		p.add(scrollingTable, "Center");

		JPanel tabSul = new JPanel();
		buttonInclude = new JButton("Include");
		tabSul.add(buttonInclude);
		buttonDelete = new JButton("Delete");
		tabSul.add(buttonDelete);
		buttonShow = new JButton("Show");
		tabSul.add(buttonShow);
		text = new JTextField("Name Selected");
		tabSul.add(text);
		p.add(tabSul, "South");
		buttonDelete.addActionListener(this);
		buttonInclude.addActionListener(this);
		buttonShow.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {

		Object origin = evt.getSource();

		if (origin == buttonInclude) {

			DefaultTableModel dtm = (DefaultTableModel) table.getModel();
			dtm.addRow(new Object[] { new Integer(++incCod), "Client " + incCod });
		}

		if (origin == buttonDelete) {

			int lines[] = table.getSelectedRows();
			DefaultTableModel dtm = (DefaultTableModel) table.getModel();
			for (int i = (lines.length - 1); i >= 0; i--) {

				dtm.removeRow(lines[i]);
			}
		}

		if (origin == buttonShow) {

			if (table.getSelectedRow() >= 0) {

				text.setText(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()).toString());
			}
		}
	}
}
