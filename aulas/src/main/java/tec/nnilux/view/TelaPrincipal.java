package tec.nnilux.view;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class TelaPrincipal {
	
	public TelaPrincipal() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Nilux Technology - Outsourcing de TI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.WHITE);
	
		
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

		JMenuItem marca = new JMenuItem("Marca");
		menuCadastro.add(marca);

		JMenuItem cliente = new JMenuItem("Cliente");
		menuCadastro.add(cliente);

		JMenuItem equipamento = new JMenuItem("Equipamento");
		menuCadastro.add(equipamento);
		
		JMenuItem item = new JMenuItem("Item");
		menuCadastro.add(item);
		
	}

	public static void main(String[] args) {

		new TelaPrincipal();

	}

}
