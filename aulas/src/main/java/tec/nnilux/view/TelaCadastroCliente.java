package tec.nnilux.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class TelaCadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	public TelaCadastroCliente() {
		componentesTela();
	}

	private void componentesTela() {
		// TITULO DA TELA
		JLabel lblTitulo = new JLabel("Cadastro de Clientes");
		lblTitulo.setBounds(50, 30, 260, 60);
		lblTitulo.setFont(new Font("Ubuntu", 1, 18));

		// JPANEL
		JPanel cadastroCliente = new JPanel(null);
		cadastroCliente.setPreferredSize(new Dimension(900, 600));
		cadastroCliente.add(lblTitulo);

		// LABEL NOME
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Ubuntu", 0, 18));
		lblNome.setBounds(50, 62, 60, 60);
		cadastroCliente.add(lblNome);

		// TEXTFIELD NOME
		JTextField txtNome = new JTextField();
		txtNome.setBounds(108, 80, 300, 30);
		cadastroCliente.add(txtNome);

		// LABEL CPF
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Ubuntu", 0, 16));
		lblCpf.setBounds(50, 114, 200, 60);

		cadastroCliente.add(lblCpf);

		// TEXTFIELD CPF
		JFormattedTextField txtCpf = new JFormattedTextField();
		try {
			txtCpf.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###-##")));
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		txtCpf.setBounds(108, 128, 300, 30);
		cadastroCliente.add(txtCpf);

		// LABEL EMAIL
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Ubuntu", 0, 18));
		lblEmail.setBounds(50, 166, 60, 60);
		cadastroCliente.add(lblEmail);

		// TEXTFIELD EMAIL
		JTextField txtEmail = new JTextField();
		txtEmail.setBounds(108, 180, 300, 30);
		cadastroCliente.add(txtEmail);

		// LABEL ENDEREÇO
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Ubuntu", 0, 18));
		lblEndereco.setBounds(50, 206, 160, 60);
		cadastroCliente.add(lblEndereco);

		// TEXTFIELD ENDEREÇO
		JTextField txtEndereco = new JTextField();
		txtEndereco.setBounds(140, 220, 266, 30);
		cadastroCliente.add(txtEndereco);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Ubuntu", 1, 16));
		btnSalvar.setBounds(50, 300, 100, 40);
		cadastroCliente.add(btnSalvar, BorderLayout.CENTER);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Ubuntu", 1, 16));
		btnLimpar.setBounds(160, 300, 100, 40);
		cadastroCliente.add(btnLimpar, BorderLayout.CENTER);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Ubuntu", 1, 16));
		btnCancelar.setBounds(280, 300, 100, 40);
		cadastroCliente.add(btnCancelar, BorderLayout.CENTER);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Ubuntu", 1, 16));
		btnConsultar.setBounds(400, 300, 120, 40);
		cadastroCliente.add(btnConsultar, BorderLayout.CENTER);

		setTitle("Nilux Technology - Outsourcing de TI");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		getContentPane().setBackground(Color.LIGHT_GRAY);

		getContentPane().add(cadastroCliente);

		pack();

		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new TelaCadastroCliente();

	}

}
