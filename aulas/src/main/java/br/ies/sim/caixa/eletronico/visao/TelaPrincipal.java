package br.ies.sim.caixa.eletronico.visao;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.ies.sim.caixa.eletronico.controle.ControleUsuario;
import br.ies.sim.caixa.eletronico.modelo.Conta;

public class TelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private static Conta contaLogada;
	private JPanel contentPane;

	public TelaPrincipal(Conta conta) {
		setResizable(false);
		contaLogada = conta;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnSaque = new JButton("Saque");
		btnSaque.setBounds(150, 30, 131, 23);
		btnSaque.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(btnSaque);
		btnSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = 0;
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para sacar."));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Digite somente números e pontos.");
					return;
				}
				int n = JOptionPane.showConfirmDialog(null, "Você confirma o saque?", "Confirmação de saque",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (n == 0) {
					double valorNovo = ControleUsuario.sacarConta(contaLogada, valor);
					if (valorNovo >= 0) {
						JOptionPane.showMessageDialog(null, "Seu novo saldo em conta é: " + valorNovo);
					} else {
						JOptionPane.showMessageDialog(null, "Houve um problema no saque, tente novamente.");
					}
				}
			}
		});

		JButton btnDeposito = new JButton("Depósito");
		btnDeposito.setBounds(150, 58, 131, 23);
		btnDeposito.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(btnDeposito);
		btnDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = 0;
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para depositar."));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Digite somente números e pontos.");
					return;
				}
				int n = JOptionPane.showConfirmDialog(null, "Você confirma o Depósito?", "Confirmação de depósito",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (n == 0) {
					double valorNovo = ControleUsuario.depositar(contaLogada, valor);
					if (valorNovo > 0) {
						JOptionPane.showMessageDialog(null, "Seu novo saldo em conta é: " + valorNovo);
					} else {
						JOptionPane.showMessageDialog(null, "Houve um problema no depósito, tente novamente.");
					}
				}

			}
		});

		JButton btnConsultarSaldo = new JButton("Consultar Saldo");
		btnConsultarSaldo.setBounds(150, 86, 131, 23);
		btnConsultarSaldo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(btnConsultarSaldo);
		btnConsultarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultaDeSaldo saldo = new TelaConsultaDeSaldo(contaLogada);
				saldo.setVisible(true);
				dispose();
			}
		});

		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.setBounds(150, 114, 131, 23);
		btnExtrato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(btnExtrato);
		btnExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnSairDaConta = new JButton("Sair da Conta");
		btnSairDaConta.setBounds(150, 172, 131, 23);
		btnSairDaConta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(btnSairDaConta);
		btnSairDaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contaLogada = null;
				TelaDeLogin logout = new TelaDeLogin();
				logout.setVisible(true);
				dispose();
			}
		});
	}
}
