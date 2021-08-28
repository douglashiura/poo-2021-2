package tec.nnilux.view;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("Nilux Technology - Outsourcing de TI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		frame.setVisible(true);

		// Barra de Menu
		JMenuBar menuBarTelaPrincipal = new JMenuBar();
		frame.setJMenuBar(menuBarTelaPrincipal);

		JMenu menuLocacao = new JMenu("Locação");
		menuBarTelaPrincipal.add(menuLocacao);

		JMenu menuCadastro = new JMenu("Cadastro");
		menuBarTelaPrincipal.add(menuCadastro);

		JMenu menuSair = new JMenu("Sair");
		menuBarTelaPrincipal.add(menuSair);

		// Itens Menus

		JMenuItem alugar = new JMenuItem("Alugar");
		menuLocacao.add(alugar);

		JMenuItem consultar = new JMenuItem("Consultar");
		menuLocacao.add(consultar);

		JMenuItem cadastroX = new JMenuItem("Cadastro X");
		menuCadastro.add(cadastroX);

		JMenuItem cadastroY = new JMenuItem("Cadastro Y");
		menuCadastro.add(cadastroY);

		JMenuItem cadastroZ = new JMenuItem("Cadastro Z");
		menuCadastro.add(cadastroZ);

	}

}
