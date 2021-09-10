package tec.nnilux.view;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	public TelaCadastroCliente() {

		this.setTitle("Nilux Technology - Outsourcing de TI");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setLocationRelativeTo(null);
		

		JPanel painel = new JPanel(null);

		// Labels Cadastro

		JLabel labelCabecalhoCliente = new JLabel("CADASTRO DE CLIENTE");
		labelCabecalhoCliente.setBounds(50, 30, 260, 60);
		labelCabecalhoCliente.setFont(new Font("Arial", Font.BOLD, 16));
		painel.add(labelCabecalhoCliente);

		JLabel labelNomeCliente = new JLabel("Nome:");
		labelNomeCliente.setBounds(50, 62, 60, 60);
		labelNomeCliente.setFont(new Font("Arial", Font.BOLD, 16));
		painel.add(labelNomeCliente);

		JLabel labelCPF = new JLabel("CPF:");
		labelCPF.setBounds(50, 122, 200, 60);
		labelCPF.setFont(new Font("Arial", Font.BOLD, 16));
		painel.add(labelCPF);
		
		JLabel labelEmail = new JLabel("E-mail:");
		labelEmail.setBounds(50, 166, 200, 60);
		labelEmail.setFont(new Font("Arial", Font.BOLD, 16));
		painel.add(labelEmail);

		// Text Box Marca
		JTextField textBoxNome = new JTextField();
		textBoxNome.setBounds(108, 80, 600, 30);
		painel.add(textBoxNome);

		JTextField textBoxCPF = new JTextField();
		textBoxCPF.setBounds(108, 136, 200, 30);
		painel.add(textBoxCPF);
		
		JTextField textBoxEmail = new JTextField();
		textBoxEmail.setBounds(108, 180, 300, 30);
		painel.add(textBoxEmail);

		getContentPane().add(painel);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TelaCadastroCliente();

	}

}
