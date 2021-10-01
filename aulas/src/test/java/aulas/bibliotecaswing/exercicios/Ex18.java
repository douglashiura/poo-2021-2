package aulas.bibliotecaswing.exercicios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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
	JPanel painel = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();
	Connection con;
	

	public Ex18(){
		configuracoes();
		painel();
		painel2();
		painel3();
	}
	
	public void painel() {
		
		painel.setLayout(new FlowLayout());
		painel.setBounds(1, 1, 480, 70);
		
		JLabel lblFonteDados = new JLabel("Fonte de dados: jdbc:postgresql://localhost:5433/postgres  Usuário: ");
		JTextField txtUsuario = new JTextField(7);
		
		JButton botaoConectarBanco = new JButton("Conectar banco");
		botaoConectarBanco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("org.postgresql.Driver");
					try {
						if (con== null) {
							con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", txtUsuario.getText(), "3242");
							JOptionPane.showMessageDialog(botaoConectarBanco, "Conectado", "Status", JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(botaoConectarBanco, "Já está conectado!", "Status", JOptionPane.INFORMATION_MESSAGE);
						}
						
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(botaoConectarBanco, "Verifique se o usuário está correto!", "Status", JOptionPane.ERROR_MESSAGE);
					}
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				
			}});

		JButton botaoDesconectarBanco = new JButton("Desconectar banco");
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
		painel.repaint();
		painel.revalidate();
		
	}
	
	public void painel2() {
		
		painel2.setLayout(null);
		painel2.setBounds(1, 71, 480, 250);
		painel2.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		JButton btnLimparLista = new JButton("Limpar lista");
		btnLimparLista.setBounds(120, 150, 110, 20);
		
		JLabel lblNomeTabela = new JLabel("Nome da tabela: ");
		lblNomeTabela.setBounds(60, 60, 110, 20);
		
		JTextField txtNomeTabela = new JTextField(7);
		txtNomeTabela.setBounds(50, 90, 110, 20);
		
		JTable tabela = new JTable();
		tabela.setBounds(242, 2, 236, 245);
		
		JButton btnCriarTabela = new JButton("Criar tabela");
		btnCriarTabela.setBounds(20, 150, 100, 20);
		btnCriarTabela.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (con==null) {
						JOptionPane.showMessageDialog(btnCriarTabela, "Conecte ao banco", "Status", JOptionPane.ERROR_MESSAGE);
					
					}else {
						PreparedStatement stm = con.prepareStatement("CREATE TABLE "+txtNomeTabela.getText()+"()");
						stm.execute();
						JOptionPane.showMessageDialog(btnCriarTabela, "Tabela criada", "Status", JOptionPane.INFORMATION_MESSAGE);
					
					}
				} catch (SQLException e1) {
					if (con== null) {
						JOptionPane.showMessageDialog(btnCriarTabela, "Conecte ao banco", "Status", JOptionPane.ERROR_MESSAGE);
					
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
		painel2.repaint();
		painel2.revalidate();
	}

	public void painel3() {
		
		painel3.setLayout(new FlowLayout());
		painel3.setBounds(1, 325, 480, 70);
		
		JTextField txtNome = new JTextField(7);
		JTextField txtTipo = new JTextField(7);

		JLabel lblNome = new JLabel("Nome:");
		JLabel lblTipo = new JLabel("Tipo:");
		
		JButton btnIncluir = new JButton("Incluir");
		JButton btnExcluir = new JButton("Excluir");
		
		painel3.add(lblNome);
		painel3.add(txtNome);
		painel3.add(lblTipo);
		painel3.add(txtTipo);
		painel3.add(btnIncluir);
		painel3.add(btnExcluir);
		
		getContentPane().add(painel3);
		painel2.repaint();
		painel2.revalidate();
		
	}
	
	public void configuracoes(){
		getContentPane().setLayout(null);
		setSize(500, 400);
		setResizable(false);
		setVisible(true);
	}
	

}
