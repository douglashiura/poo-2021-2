package br.ies.sim.caixa.eletronico.visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import br.ies.sim.caixa.eletronico.controle.ControleUsuario;
import br.ies.sim.caixa.eletronico.modelo.Conta;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;

public class TelaConsultaDeSaldo extends JFrame {
	private static final long serialVersionUID = 1L;
	private static Conta contaLogada;
	private JPanel contentPane;

	public TelaConsultaDeSaldo(Conta conta) {
		setResizable(false);
		contaLogada = conta;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSaldoAtual = new JLabel("Saldo atual:");
		lblSaldoAtual.setBounds(70, 57, 67, 16);
		lblSaldoAtual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(lblSaldoAtual);

		JButton btnSaque = new JButton("Sacar");
		btnSaque.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSaque.setBounds(128, 105, 77, 23);
		panel.add(btnSaque);
		btnSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = 0;
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para depositar."));
				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Digite somente números e pontos.");
				}
				int n = JOptionPane.showConfirmDialog(null, "Você confirma o saque?", "Confirmação de saque",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (n == 0) {
					System.out.println("Valor de N" + n);
					double valorNovo = ControleUsuario.sacarConta(contaLogada, valor);
					if (valorNovo > 0) {
						JOptionPane.showMessageDialog(null, "Seu novo saldo em conta é: " + valorNovo);
					} else {
						JOptionPane.showMessageDialog(null, "Houve um problema no saque, tente novamente.");
					}

				}
			}
		});

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(128, 141, 79, 23);
		panel.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal voltar = new TelaPrincipal(contaLogada);
				voltar.setVisible(true);
				dispose();
			}
		});

		JTextPane txtpnTextsaldo = new JTextPane();
		txtpnTextsaldo.setBounds(157, 52, 110, 21);
		txtpnTextsaldo.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(txtpnTextsaldo);
		if (contaLogada != null) {
			txtpnTextsaldo.setText("R$ " + Double.toString(contaLogada.getSaldoConta()));
		} else {
			txtpnTextsaldo.setText("R$ 0,00");
		}
	}
}