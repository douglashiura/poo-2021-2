package com.github.pedrolucascorrea.poo.test.exercicios.modulo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class WizardBDE18 extends JFrame {

	public WizardBDE18() {
		CreateTableE18 createTable = new CreateTableE18();
		DeleteIntoTableE18 deleteIntoTable = new DeleteIntoTableE18();

		// Panels
		JPanel panel = new JPanel();
		JPanel login = new JPanel();
		JPanel panelDeConexão = new JPanel();
		JPanel inputPanelWrapper = new JPanel();
		JPanel inputPanel = new JPanel();
		JPanel createPanel = new JPanel();
		JPanel columnsPanel = new JPanel();

		// Labels
		JLabel userLabel = new JLabel("Usuário");
		JLabel userPassword = new JLabel("Senha");
		JLabel conectionStatusLabel = new JLabel("Não conectado");
		JLabel labelNomeDaTabela = new JLabel("Nome da Tabela");
		JLabel nameLabel = new JLabel("Nome");
		JLabel typeLabel = new JLabel("Tipo");

		// Buttons
		JButton connectButton = new JButton("Conectar");
		JButton desconectButton = new JButton("Desconectar");
		JButton createTableButton = new JButton("Criar Tabela");
		JButton clearListButton = new JButton("Limpar lista");
		JButton includeButton = new JButton("Incluir");
		JButton deleteButton = new JButton("Excluir");

		// TextFields
		TextField fieldUsuario = new TextField();
		TextField userPasswordField = new TextField();
		TextField fieldNomeDaTabela = new TextField();
		TextField nameField = new TextField();
		TextField typeField = new TextField();

		// JTable
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Column name", "Column Type" }));

		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(1).setResizable(true);

		// JScrollPane
		JScrollPane tableRoll = new JScrollPane(table);
		inputPanel.add(tableRoll, "Center");

		// ActionListeners
		fieldUsuario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setUser(fieldUsuario.getText());
			}

		});

		userPasswordField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setPassword(userPasswordField.getText());
			}

		});

		connectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setUser(fieldUsuario.getText());
				createTable.setPassword(userPasswordField.getText());
				createTable.connectToDatabase();
				conectionStatusLabel.setText(createTable.getConnectionStatus());
			}

		});

		desconectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.desconnectFromDatabase();
				conectionStatusLabel.setText(createTable.getConnectionStatus());
			}

		});

		fieldNomeDaTabela.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		createTableButton.addActionListener(new ActionListener() {
			String sentenceSQL;
			String columnAndType = "";

			// ALTER TABLE table_name
			// ADD last_name VARCHAR(50),
			// first_name VARCHAR(40);

			@Override
			public void actionPerformed(ActionEvent e) {
				sentenceSQL = "CREATE TABLE " + fieldNomeDaTabela.getText() + " (";
				for (int count = 0; count < table.getRowCount(); count++) {
					if (count == table.getRowCount() - 1) {
						columnAndType += " " + table.getValueAt(count, 0).toString() + " "
								+ table.getValueAt(count, 1).toString();
					} else {
						columnAndType += " " + table.getValueAt(count, 0).toString() + " "
								+ table.getValueAt(count, 1).toString() + ",";
					}
				}

				sentenceSQL = sentenceSQL + columnAndType + ");";

				System.out.println(columnAndType);

				createTable.createDatabaseBySQL(sentenceSQL);
			}

		});

		clearListButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.setRowCount(0);
			}

		});

		nameField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		typeField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		includeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] { nameField.getText(), typeField.getText() });
			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				System.out.println(table.getSelectedRow());
				deleteIntoTable.deleteIntoDatabase(fieldUsuario.getText(), userPasswordField.getText(),
						fieldNomeDaTabela.getText(), (String) dtm.getValueAt(table.getSelectedRow(), 0));
				dtm.removeRow(table.getSelectedRow());
			}

		});

		connectButton.setBackground(Color.green);
		desconectButton.setBackground(Color.red);
		desconectButton.setForeground(Color.white);

		panel.add(login);
		panel.add(panelDeConexão);
		panel.add(inputPanelWrapper);
		panel.add(createPanel);
		panel.add(columnsPanel);

		login.add(userLabel);
		login.add(fieldUsuario);
		login.add(userPassword);
		login.add(userPasswordField);
		login.setPreferredSize(new Dimension(800, 30));

		fieldUsuario.setPreferredSize(new Dimension(90, 30));
		userPasswordField.setPreferredSize(new Dimension(90, 30));
		userPasswordField.setEchoChar('$');

		panelDeConexão.add(connectButton);
		panelDeConexão.add(conectionStatusLabel);
		panelDeConexão.add(desconectButton);

		inputPanelWrapper.setPreferredSize(new Dimension(800, 350));
		inputPanelWrapper.setLayout(new GridLayout(2, 1));
		inputPanelWrapper.add(inputPanel);
		inputPanelWrapper.add(createPanel);

		createPanel.add(labelNomeDaTabela);
		createPanel.add(fieldNomeDaTabela);
		inputPanel.setPreferredSize(new Dimension(800, 200));
		fieldNomeDaTabela.setPreferredSize(new Dimension(90, 30));

		createPanel.add(createTableButton);
		createPanel.add(clearListButton);

		columnsPanel.add(nameLabel);
		columnsPanel.add(nameField);
		columnsPanel.add(typeLabel);
		columnsPanel.add(typeField);
		columnsPanel.add(includeButton);
		columnsPanel.add(deleteButton);
		nameField.setPreferredSize(new Dimension(90, 30));
		typeField.setPreferredSize(new Dimension(90, 30));

		// Configuracoes JFrame
		setTitle("Wizard para criação de tabelas BD");
		getContentPane().add(panel);
		setSize(800, 620);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		WizardBDE18 manipularBD = new WizardBDE18();
		manipularBD.setVisible(true);

	}

}
