package testeConexaoComBancoDeDado;

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
import javax.swing.border.EtchedBorder;


public class CriarTabelaBanco{

	JButton connectButton = new JButton("Conectar Banco");
	JButton desconectButton = new JButton("Desconectar Banco");
	JButton createTableButton = new JButton("Criar Tabela");
	JButton clearListButton = new JButton("Limpar lista");
	JButton includeButton = new JButton("Incluir");
	JButton deleteButton = new JButton("Excluir");
	
	JFrame frame = new JFrame("Wizard para criação de tabelas BD");
	JPanel panel = new JPanel();
	CriarTabelaE18 createTable = new CriarTabelaE18();
	JPanel infoPanel = new JPanel();
	JPanel connectPanel = new JPanel();
	JPanel inputPanelWrapper = new JPanel();
	JPanel inputPanel = new JPanel();
	JPanel createPanel = new JPanel();
	JPanel tablePanel = new JPanel();
	JLabel label = new JLabel("Fonte de dados: ");
	JLabel labelTwo = new JLabel("jdbc:postgresql://localhost:5432/AulasJava");
	JLabel userLabel = new JLabel("Usuário");
	JLabel conectionStatusLabel = new JLabel("Não conectado");
	JLabel tableNameLabel = new JLabel("Nome da Tebela");
	JLabel nameLabel = new JLabel("Nome");
	JLabel typeLabel = new JLabel("Tipo");
	TextField userField = new TextField();
	TextField senhaField = new TextField();
	TextField tableNameField = new TextField();
	TextField tableQueryField = new TextField();
	TextField nameField = new TextField();
	TextField typeField = new TextField();
	
	public static void main(String[] args) {
		new CriarTabelaBanco(null);
	}

	public CriarTabelaBanco(String[] args) {

		frame.getContentPane().add(panel);
		
		addAction();
		
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
		infoPanel.add(senhaField);
		senhaField.setPreferredSize(new Dimension(120, 30));
		
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
	}

	private void addAction() {
		// TODO Auto-generated method stub
		userField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setUser(userField.getText());
				createTable.conectar();
				conectionStatusLabel.setText(createTable.getConnectionStatus());
			}
			
		});
		senhaField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setSenha(senhaField.getText());
				createTable.conectar();
				conectionStatusLabel.setText(createTable.getConnectionStatus());
			}
			
		});
		connectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.setUser(userField.getText());
				createTable.setSenha(userField.getText());
				createTable.conectar();
				conectionStatusLabel.setText(createTable.getConnectionStatus());
			}
			
		});

		tableNameField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		desconectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createTable.desconectar();
				conectionStatusLabel.setText(createTable.getConnectionStatus());
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
		includeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				createTable.createCollumnDatabaseTable(tableNameField.getText(), nameField.getText(), typeField.getText());
				
			}
			
		});
		
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				createTable.deleteCollumnDatabaseTable(tableNameField.getText(), nameField.getText());
				
			}
			
		});
		
		clearListButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tableQueryField.setText("");
				
			}
			
		});
	

	}
	
	
}
