package tec.nnilux.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroMarca extends JFrame {

	private static final long serialVersionUID = 1L;

	public TelaCadastroMarca() {

		this.setTitle("Nilux Technology - Outsourcing de TI");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setLocationRelativeTo(null);

		JPanel painel = new JPanel(null);

		// Label Cabeçalho
		JLabel labelCabecalho = new JLabel("CADASTRO DE EQUIPAMENTO");
		labelCabecalho.setBounds(50, 30, 260, 60);
		labelCabecalho.setFont(new Font("Arial", Font.BOLD, 16));
		painel.add(labelCabecalho);

		// Label Marca
		JLabel labelMarca = new JLabel("Marca:");
		labelMarca.setBounds(50, 62, 60, 60);
		labelMarca.setFont(new Font("Arial", Font.BOLD, 16));
		painel.add(labelMarca);

		// Text Box Marca
		JTextField textBox = new JTextField();
		textBox.setBounds(108, 80, 600, 30);
		painel.add(textBox);

		// Label Equipamentos
		JLabel labelEquipamento = new JLabel("Equipamento:");
		labelEquipamento.setBounds(50, 122, 200, 60);
		labelEquipamento.setFont(new Font("Arial", Font.BOLD, 16));
		painel.add(labelEquipamento);

		// ComboBox Equipamentos
		String[] marcas = new String[] { "Selecione um Equipamento", "Desktop", "Notebook", "Impressora", "Celular",
				"Tablet" };
		JComboBox<String> comboMarcas = new JComboBox<String>(marcas);
		comboMarcas.setBounds(160, 140, 260, 30);
		painel.add(comboMarcas);

		// Botões
		JButton btSalvar = new JButton("Salvar");
		btSalvar.setBounds(50, 200, 100, 40);
		painel.add(btSalvar, BorderLayout.CENTER);

		JButton btLimpar = new JButton("Limpar");
		btLimpar.setBounds(160, 200, 100, 40);
		painel.add(btLimpar, BorderLayout.CENTER);

		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(280, 200, 100, 40);
		painel.add(btCancelar, BorderLayout.CENTER);

		JButton btConsultar = new JButton("Consultar");
		btConsultar.setBounds(400, 200, 120, 40);
		painel.add(btConsultar, BorderLayout.CENTER);

		getContentPane().add(painel);
		this.setVisible(true);

	}

	public static void main(String args[]) {
		new TelaCadastroMarca();
	}
}
