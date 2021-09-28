package com.github.pedrolucascorrea.poo.test.exercicios.modulo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class WizardBDE18 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Wizard para criação de tabelas BD");
		JPanel panel = new JPanel();
		CreateTableE18 createTable = new CreateTableE18();
		DeleteIntoTableE18 deleteIntoTable = new DeleteIntoTableE18();
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(Color.yellow);
		JPanel credentials = new JPanel();
		JPanel connectPanel = new JPanel();
		JPanel inputPanelWrapper = new JPanel();
		JPanel inputPanel = new JPanel();
		JPanel createPanel = new JPanel();
		JPanel tablePanel = new JPanel();
		frame.getContentPane().add(panel);

		JLabel label = new JLabel("Fonte de dados: ");
		JLabel labelTwo = new JLabel("jdbc:postgresql://localhost:5432/java-bd-2");
		JLabel userLabel = new JLabel("Usuário");
		JLabel userPassword = new JLabel("Senha");
		JLabel conectionStatusLabel = new JLabel("Não conectado");
		JLabel tableNameLabel = new JLabel("Nome da Tabela");
		JLabel nameLabel = new JLabel("Nome");
		JLabel typeLabel = new JLabel("Tipo");

		JButton connectButton = new JButton("Conectar Banco");
		connectButton.setBackground(Color.green);
		JButton desconectButton = new JButton("Desconectar Banco");
		desconectButton.setBackground(Color.red);
		desconectButton.setForeground(Color.white);
		JButton createTableButton = new JButton("Criar Tabela");
		JButton clearListButton = new JButton("Limpar lista");
		JButton includeButton = new JButton("Incluir");
		JButton deleteButton = new JButton("Excluir");

		TextField userField = new TextField();
		userField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setUser(userField.getText());
			}

		});

		TextField userPasswordField = new TextField();
		userPasswordField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setPassword(userPasswordField.getText());
			}

		});

		connectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setUser(userField.getText());
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

		TextField tableNameField = new TextField();

		tableNameField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		JTable table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Column name", "Column Type" }));

		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(1).setResizable(true);

		JScrollPane tableRoll = new JScrollPane(table);
		inputPanel.add(tableRoll, "Center");

		createTableButton.addActionListener(new ActionListener() {
			String sentenceSQL;
			String columnAndType = "";

			// ALTER TABLE table_name
			// ADD last_name VARCHAR(50),
			// first_name VARCHAR(40);

			@Override
			public void actionPerformed(ActionEvent e) {
				sentenceSQL = "CREATE TABLE " + tableNameField.getText() + " (";
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

		TextField nameField = new TextField();
		nameField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		TextField typeField = new TextField();
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
				deleteIntoTable.deleteIntoDatabase(userField.getText(), userPasswordField.getText(),
						tableNameField.getText(), (String) dtm.getValueAt(table.getSelectedRow(), 0));
				dtm.removeRow(table.getSelectedRow());
			}

		});

		panel.add(infoPanel);
		panel.add(credentials);
		panel.add(connectPanel);
		panel.add(inputPanelWrapper);
		panel.add(createPanel);
		panel.add(tablePanel);

		infoPanel.add(label);
		infoPanel.add(labelTwo);
		credentials.add(userLabel);
		credentials.add(userField);
		credentials.add(userPassword);
		credentials.add(userPasswordField);
		credentials.setPreferredSize(new Dimension(800, 30));

		userField.setPreferredSize(new Dimension(90, 30));
		userPasswordField.setPreferredSize(new Dimension(90, 30));

		connectPanel.add(connectButton);
		connectPanel.add(conectionStatusLabel);
		connectPanel.add(desconectButton);

		inputPanelWrapper.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		inputPanelWrapper.setPreferredSize(new Dimension(800, 350));
		inputPanelWrapper.setLayout(new GridLayout(2, 1));
		inputPanelWrapper.add(inputPanel);
		inputPanelWrapper.add(createPanel);

		createPanel.add(tableNameLabel);
		createPanel.add(tableNameField);
		inputPanel.setPreferredSize(new Dimension(800, 200));
		tableNameField.setPreferredSize(new Dimension(90, 30));

		createPanel.add(createTableButton);
		createPanel.add(clearListButton);

		tablePanel.add(nameLabel);
		tablePanel.add(nameField);
		tablePanel.add(typeLabel);
		tablePanel.add(typeField);
		tablePanel.add(includeButton);
		tablePanel.add(deleteButton);
		nameField.setPreferredSize(new Dimension(90, 30));
		typeField.setPreferredSize(new Dimension(90, 30));

		frame.setSize(800, 620);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
