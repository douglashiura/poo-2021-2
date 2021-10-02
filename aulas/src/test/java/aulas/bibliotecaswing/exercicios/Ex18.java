package aulas.bibliotecaswing.exercicios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import testeconexao.ConexaoBD;

public class Ex18 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel painel = new JPanel();
	private JPanel painel2 = new JPanel();
	private JPanel painel3 = new JPanel();
	private JTextField txtNomeTabela = new JTextField();
	private JTextField txtNomeColuna = new JTextField(7);
	private JTextField txtTipoColuna = new JTextField(7);
	private JLabel lblFonteDados = new JLabel("Fonte de dados: jdbc:postgresql://localhost:5433/postgres  Usuário: ");
	private JTextField txtUsuario = new JTextField(7);
	private JButton botaoDesconectarBanco = new JButton("Desconectar banco");
	private JButton botaoConectarBanco = new JButton("Conectar banco");
	private JButton btnLimparLista = new JButton("Limpar lista");
	private JButton btnCriarTabela = new JButton("Criar tabela");
	private JLabel lblNomeTabela = new JLabel("Nome da tabela: ");
	private JTable tabela = new JTable();
	private JButton btnExcluir = new JButton("Excluir");
	private JLabel lblNome = new JLabel("Nome:");
	private JLabel lblTipo = new JLabel("Tipo:");
	private JButton btnIncluir = new JButton("Incluir");
	Connection con;

	public Ex18(){
		configuracoes();
		painel();
		painel2();
		painel3();
	}
	
	public void painel() {
		
		botaoConectarBanco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (con == null) {
						con = new ConexaoBD().conectarEx18(txtUsuario.getText());
						JOptionPane.showMessageDialog(botaoConectarBanco, "Conectado", "Status", JOptionPane.INFORMATION_MESSAGE);
					
					}else {
						JOptionPane.showMessageDialog(botaoConectarBanco, "Já está conectado!", "Status", JOptionPane.INFORMATION_MESSAGE);
					}
					
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(botaoConectarBanco, "Verifique se o usuário está correto!", "Status", JOptionPane.ERROR_MESSAGE);
				}
				
			}});

		botaoDesconectarBanco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (con != null) {
						con.close();
						con = null;
						JOptionPane.showMessageDialog(botaoConectarBanco, "Desconectado!", "Status", JOptionPane.INFORMATION_MESSAGE);
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}});
		
		painel.add(lblFonteDados);
		painel.add(txtUsuario);
		painel.add(botaoConectarBanco);
		painel.add(botaoDesconectarBanco);
		
		getContentPane().add(painel);
		painel.setLayout(new FlowLayout());
		painel.setBounds(1, 1, 480, 70);
		painel.repaint();
		painel.revalidate();
	}
	
	public void painel2() {
		
		btnLimparLista.setBounds(120, 150, 110, 20);
		lblNomeTabela.setBounds(60, 60, 110, 20);
		btnCriarTabela.setBounds(20, 150, 100, 20);
		tabela.setBounds(242, 2, 236, 245);
		
		btnCriarTabela.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (con== null) {
						JOptionPane.showMessageDialog(btnCriarTabela, "Conecte ao banco", "Status", JOptionPane.ERROR_MESSAGE);
					
					}else {
						new ConexaoBD().criarNovaTabela(txtNomeTabela);
						JOptionPane.showMessageDialog(btnCriarTabela, "Tabela criada", "Status", JOptionPane.INFORMATION_MESSAGE);
					
					}
				} catch (SQLException e1) {
					if (con== null) {
						JOptionPane.showMessageDialog(btnCriarTabela, "Conecte ao banco!", "Status", JOptionPane.ERROR_MESSAGE);
					
					}else if (txtNomeTabela.getText().isEmpty()) {
						JOptionPane.showMessageDialog(btnCriarTabela, "A tabela precisa de um nome!", "Status", JOptionPane.ERROR_MESSAGE);
					
					} else {
						JOptionPane.showMessageDialog(btnCriarTabela, "A tabela já existe!", "Status", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		painel2.add(txtNomeTabela);
		painel2.add(btnCriarTabela);
		painel2.add(btnLimparLista);
		painel2.add(lblNomeTabela);
		painel2.add(tabela);
		
		getContentPane().add(painel2);
		painel2.setLayout(null);
		painel2.setBounds(1, 71, 480, 250);
		painel2.setBorder(BorderFactory.createLineBorder(Color.black,1));
		painel2.repaint();
		painel2.revalidate();
	}

	public void painel3() {
		
		txtNomeTabela.setBounds(50, 90, 110, 20);
		
		btnIncluir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (con == null) {
						JOptionPane.showMessageDialog(btnIncluir, "Conecte ao banco", "Status", JOptionPane.ERROR_MESSAGE);
					
					}else {
						ConexaoBD conexao = new ConexaoBD();
						conexao.inserirColuna(txtNomeTabela, txtNomeColuna, txtTipoColuna);
						JOptionPane.showMessageDialog(btnIncluir, "Coluna inserida", "Status", JOptionPane.INFORMATION_MESSAGE);
					}
					
				} catch (Exception e1) {
					if (txtNomeTabela.getText().isEmpty()) {
						JOptionPane.showMessageDialog(btnIncluir, "Insira o nome da tabela!", "Status", JOptionPane.ERROR_MESSAGE);
					
					}else if (txtNomeColuna.getText().isEmpty()) {
						JOptionPane.showMessageDialog(btnIncluir, "Insira o nome da coluna!", "Status", JOptionPane.ERROR_MESSAGE);
					
					}else if (txtTipoColuna.getText().isEmpty()){
						JOptionPane.showMessageDialog(btnIncluir, "Insira o tipo da coluna", "Status", JOptionPane.ERROR_MESSAGE);
					
					}else {
						JOptionPane.showMessageDialog(btnIncluir, "Verifique as informações da tabela", "Status", JOptionPane.ERROR_MESSAGE);

					}
					
				}
				
			}
			
		});
		
		painel3.add(lblNome);
		painel3.add(txtNomeColuna);
		painel3.add(lblTipo);
		painel3.add(txtTipoColuna);
		painel3.add(btnIncluir);
		painel3.add(btnExcluir);
		
		getContentPane().add(painel3);
		painel3.setLayout(new FlowLayout());
		painel3.setBounds(1, 325, 480, 70);
		painel3.repaint();
		painel3.revalidate();
	}
	
	public void configuracoes(){
		getContentPane().setLayout(null);
		setSize(500, 400);
		setResizable(false);
		setVisible(true);
	}
	

}
