package aulas.bibliotecaswing.exercicios;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Ex17 extends JTabbedPane  {
	private static final long serialVersionUID = 1L;
	private JPanel panelDados = new JPanel();
	private JPanel panelEmprego = new JPanel();
	private JPanel panelRelatorio = new JPanel();
	JTabbedPane abas = new JTabbedPane();

	public Ex17(){
		
		panelDados();
		panelEmprego();
		panelRelatorio();
		
		addTab("Dados Pessoais", panelDados);
		addTab("Emprego", panelEmprego);
		addTab("Relatório", panelRelatorio);
	}

	public void panelDados() {
		panelDados.setLayout(null);
		panelDados.setBackground(Color.green);
		panelDados.setVisible(true);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setFont(new Font("Courier New", Font.BOLD, 30));
		labelNome.setBounds(620, 100, 200, 30);
		labelNome.setVisible(true);
		
		JTextField cxTextoNome = new JTextField();
		cxTextoNome.setBounds(560, 150, 200, 30);
		cxTextoNome.setVisible(true);
		
		JLabel labelEndereco = new JLabel("Endereço:");
		labelEndereco.setFont(new Font("Courier New", Font.BOLD, 30));
		labelEndereco.setBounds(590, 200, 400, 30);
		labelEndereco.setVisible(true);
		
		JTextField cxTextoEndereco = new JTextField();
		cxTextoEndereco.setBounds(470, 250, 400, 30);
		cxTextoEndereco.setVisible(true);
		
		panelDados.add(labelNome);
		panelDados.add(cxTextoNome);
		panelDados.add(labelEndereco);
		panelDados.add(cxTextoEndereco);
	}
	
	public void panelEmprego() {
		panelEmprego.setVisible(true);
		panelEmprego.setLayout(null);
		panelEmprego.setBackground(Color.yellow);
		
		JLabel labelEmpresa = new JLabel("Empresa:");
		labelEmpresa.setFont(new Font("Courier New", Font.BOLD, 30));
		labelEmpresa.setBounds(600, 100, 200, 30);
		labelEmpresa.setVisible(true);
		
		JTextField cxTextoEmpresa = new JTextField();
		cxTextoEmpresa.setBounds(560, 150, 200, 30);
		cxTextoEmpresa.setVisible(true);
		
		JLabel labelFuncao = new JLabel("Função:");
		labelFuncao.setFont(new Font("Courier New", Font.BOLD, 30));
		labelFuncao.setBounds(600, 200, 400, 30);
		labelFuncao.setVisible(true);
		
		JTextField cxTextoFuncao = new JTextField();
		cxTextoFuncao.setBounds(470, 250, 400, 30);
		cxTextoFuncao.setVisible(true);
		
		panelEmprego.add(labelEmpresa);
		panelEmprego.add(cxTextoEmpresa);
		panelEmprego.add(labelFuncao);
		panelEmprego.add(cxTextoFuncao);
		
	}
	
	private void panelRelatorio() {
		panelRelatorio.setLayout(null);
		panelRelatorio.setBackground(Color.blue);
		panelRelatorio.setVisible(true);
		
		JButton botao1 = new JButton("Alterar dados pessoais");
		botao1.setBounds(500, 150, 300, 30);
		botao1.setVisible(true);
		
		JButton botao2 = new JButton("Alterar dados de emprego");
		botao2.setBounds(500, 200, 300, 30);
		botao2.setVisible(true);
		
		JButton botao3 = new JButton("Gerar relatório");
		botao3.setBounds(500, 250, 300, 30);
		botao3.setVisible(true);

		panelRelatorio.add(botao1);
		panelRelatorio.add(botao2);
		panelRelatorio.add(botao3);
	}

}

