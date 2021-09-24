package tec.nnilux.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroEquipamento extends JFrame {

	private static final long serialVersionUID = 1L;

	public TelaCadastroEquipamento() {
		componentesTela();
	}

	private void componentesTela() {
		

		JPanel cadastroMarca = new JPanel(null);
		cadastroMarca.setPreferredSize(new Dimension(900, 600));

		JLabel lblMarca = new JLabel("Nome:");
		lblMarca.setFont(new Font("Ubuntu", 0, 18));
		lblMarca.setBounds(50, 62, 60, 60);
		cadastroMarca.add(lblMarca);

		JTextField txtMarca = new JTextField();
		txtMarca.setBounds(108, 80, 600, 30);
		cadastroMarca.add(txtMarca);

		JLabel lblEquipamento = new JLabel("Tipo");
		lblEquipamento.setFont(new Font("Ubuntu", 0, 16));
		lblEquipamento.setBounds(50, 122, 200, 60);
		cadastroMarca.add(lblEquipamento);
		
		String[]tipos = new String [] {"Selecione um Equipamento","Desktop", "Notebook", "Impressora", "Celular", "Tablet"};
		JComboBox<String> comboTipo = new JComboBox<String>(tipos);
		comboTipo.setBounds(160, 140, 260, 30);
		comboTipo.setFont(new Font("Ubuntu", 0, 16));
		cadastroMarca.add(comboTipo);
		
		//equipamentos.setModel(new DefaultComboBoxModel<>(new String[] { "Dell", "Acer", "Positivo", "AOC" }));

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Ubuntu", 1, 16));
		btnSalvar.setBounds(50, 200, 100, 40);
		cadastroMarca.add(btnSalvar, BorderLayout.CENTER);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Ubuntu", 1, 16));
		btnLimpar.setBounds(160, 200, 100, 40);
		cadastroMarca.add(btnLimpar, BorderLayout.CENTER);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Ubuntu", 1, 16));
		btnCancelar.setBounds(280, 200, 100, 40);
		cadastroMarca.add(btnCancelar, BorderLayout.CENTER);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Ubuntu", 1, 16));
		btnConsultar.setBounds(400, 200, 120, 40);
		cadastroMarca.add(btnConsultar, BorderLayout.CENTER);
		
		
		setTitle("Cadastro de Equipamentos");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		getContentPane().add(cadastroMarca);
		
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String args[]) {
		new TelaCadastroEquipamento();
	}
}
