package tec.nnilux.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaPrincipal() {
		componentesTela();
	}

	private void componentesTela() {

		JMenuBar menuBarTelaPrincipal = new JMenuBar();

		JMenu menuLocacao = new JMenu("Locação");
		menuLocacao.setFont(new Font("Ubuntu", 0, 18));

		JMenuItem itemAlugar = new JMenuItem("Alugar");
		itemAlugar.setFont(new Font("Ubuntu", 0, 18));
		menuLocacao.add(itemAlugar);

		JMenuItem itemConsultar = new JMenuItem("Consultar");
		itemConsultar.setFont(new Font("Ubuntu", 0, 18));
		menuLocacao.add(itemConsultar);

		menuBarTelaPrincipal.add(menuLocacao);

		JMenu menuCadastro = new JMenu("Cadastro");
		menuCadastro.setFont(new Font("Ubuntu", 0, 18));

		JMenuItem itemCliente = new JMenuItem("Cliente");
		itemCliente.setFont(new Font("Ubuntu", 0, 18));
		menuCadastro.add(itemCliente);

		JMenuItem itemEquipamentos = new JMenuItem("Equipamentos");
		itemEquipamentos.setFont(new Font("Ubuntu", 0, 18));
		itemEquipamentos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				itemEquipamentos(evt);

			}

			private void itemEquipamentos(ActionEvent evt) {
				new TelaCadastroEquipamento().setVisible(true);

			}
		});

		menuCadastro.add(itemEquipamentos);

		menuBarTelaPrincipal.add(menuCadastro);

		JMenu menuSair = new JMenu("Sair");
		menuSair.setFont(new Font("Ubuntu", 0, 18));
		menuSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				menuSair(evt);
			}

			private void menuSair(ActionEvent evt) {
				System.exit(0);
				
			}
		});
		menuBarTelaPrincipal.add(menuSair);

		setTitle("Nilux Technology - Outsourcing de TI");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		getContentPane().setBackground(Color.LIGHT_GRAY);

		setJMenuBar(menuBarTelaPrincipal);
		pack();

		setSize(900, 600);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {

		new TelaPrincipal();
		;

	}

}
