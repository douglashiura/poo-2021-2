package com.ies.poo.classes;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class WizardExercise {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Wizard para criação de tabelas BD");
		JPanel panel = new JPanel();
		CreateTableE18 createTable = new CreateTableE18();
		JPanel infoPanel = new JPanel();
		JPanel connectPanel = new JPanel();
		JPanel inputPanelWrapper = new JPanel();
		JPanel inputPanel = new JPanel();
		JPanel createPanel = new JPanel();
		JPanel tablePanel = new JPanel();
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("Fonte de dados: ");
		JLabel labelTwo = new JLabel("jdbc:postgresql://localhost:5432/java-bd-2");
		JLabel userLabel = new JLabel("Usuário");
		JLabel conectionStatusLabel = new JLabel("Não conectado");
		JLabel tableNameLabel = new JLabel("Nome da Tebela");
		JLabel nameLabel = new JLabel("Nome");
		JLabel typeLabel = new JLabel("Tipo");
		
		JButton connectButton = new JButton("Conectar Banco");
		JButton desconectButton = new JButton("Desconectar Banco");
		JButton createTableButton = new JButton("Criar Tabela");
		JButton clearListButton = new JButton("Limpar lista");
		JButton includeButton = new JButton("Incluir");
		JButton deleteButton = new JButton("Excluir");
		
		TextField userField = new TextField();
		userField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setUser(userField.getText());
				createTable.connectToDatabase();
				conectionStatusLabel.setText(createTable.getConnectionStatus());
			}
			
		});
		
		connectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setUser(userField.getText());
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
				// TODO Auto-generated method stub
				
			}
			
		});
		
		TextField tableQueryField = new TextField();
		
		tableQueryField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		createTableButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tableNameField.getText().isEmpty()) {
					createTable.createDatabaseBySQL(tableQueryField.getText());
				} else {
					createTable.createDatabaseTable(tableNameField.getText());
				}
			}
			
		});
	
		
		TextField nameField = new TextField();
		TextField typeField = new TextField();
		
		
		panel.add(infoPanel);
		panel.add(connectPanel);
		panel.add(inputPanelWrapper);
		panel.add(createPanel);
		panel.add(tablePanel);
		
		infoPanel.add(label);
		infoPanel.add(labelTwo);
		infoPanel.add(userLabel);
		infoPanel.add(userField);
		userField.setPreferredSize(new Dimension(90, 30));
		
		connectPanel.add(connectButton);
		connectPanel.add(conectionStatusLabel);
		connectPanel.add(desconectButton);
		
		inputPanelWrapper.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		inputPanelWrapper.setPreferredSize(new Dimension(800, 350));
		inputPanelWrapper.setLayout(new GridLayout(2, 1));
		inputPanelWrapper.add(inputPanel);
		inputPanelWrapper.add(createPanel);
		
		inputPanel.add(tableNameLabel);
		inputPanel.add(tableNameField);
		inputPanel.add(tableQueryField);
		tableNameField.setPreferredSize(new Dimension(90, 30));
		tableQueryField.setPreferredSize(new Dimension(300, 200));
		
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
		
        frame.setSize(800, 520);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println(createTable.getConnectionStatus());
	}

}
