package br.com.gustavo.shell.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class TelaInicial {
	public static void main(String[] args) {

			JFrame frame = new JFrame();
			frame.setTitle("BayPC | Hardware");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400, 500);
			frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.WHITE);
			
			// Barra de Menu
			JMenuBar telaInicial = new JMenuBar();
			frame.setJMenuBar(telaInicial);
			
			JMenu menuInformacoesHardware = new JMenu("Hardware");
			telaInicial.add(menuInformacoesHardware);
			
			JMenu suporte = new JMenu("Suporte");
			telaInicial.add(suporte);
			
			JMenu menuSobre = new JMenu("Sobre");
			telaInicial.add(menuSobre);

			// Itens Menus
			
			JMenuItem placaMae = new JMenuItem("Placa Mãe");
			menuInformacoesHardware.add(placaMae);
			
			JMenuItem memoriaRam = new JMenuItem("Memoria RAM");
			menuInformacoesHardware.add(memoriaRam);

			JMenuItem cpu = new JMenuItem("CPU");
			menuInformacoesHardware.add(cpu);

			JMenuItem gpu = new JMenuItem("GPU");
			menuInformacoesHardware.add(gpu);

			JMenuItem armazenamento = new JMenuItem("Armazenamento");
			menuInformacoesHardware.add(armazenamento);
			
			JMenuItem sistemaOperacional = new JMenuItem("Sistema Operacional");
			menuInformacoesHardware.add(sistemaOperacional);

	}
}

