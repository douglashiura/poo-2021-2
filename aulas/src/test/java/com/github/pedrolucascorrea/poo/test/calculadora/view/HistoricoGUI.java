package com.github.pedrolucascorrea.poo.test.calculadora.view;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.bruno.controller.HistoricoController;
import br.com.bruno.model.Expressao;

public class HistoricoGUI implements ActionListener{
		private JFrame frame;
		private Dimension frameSize = Toolkit.getDefaultToolkit().getScreenSize();
		private Integer screenWidth = (int) frameSize.getWidth() , screenHeight = (int) frameSize.getHeight();
		private Integer frameWidth = screenWidth/5,frameHeight = screenHeight/3;
		private JButton botao;
		private JTable tabela;
		private DefaultTableModel modelo;
		private Font myFont = new Font("Sans-Serif",Font.BOLD,20);
		private HistoricoController histController;
		
	public HistoricoGUI(HistoricoController historico) {
		histController = historico;
		frame = new JFrame("Histórico");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(frameWidth, frameHeight);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocation(screenWidth/2-(frameWidth/2), screenHeight/2-(frameHeight/2));
		frame.setAutoRequestFocus(false);
		
		botao = new JButton("Back");
		botao.setBounds(17, 5, frameWidth-50, (frameHeight/10)-10);
		botao.addActionListener(this);
		botao.setFont(myFont);
		botao.setFocusable(false);
		frame.add(botao);
		
		tabela = new JTable();
		modelo = (DefaultTableModel) tabela.getModel();
		
		modelo.addColumn("ID");
		modelo.addColumn("Expressão");
		modelo.addColumn("Resposta");
		
		preencherTabela();
		tabela.setBounds(5, botao.getY()+(int)botao.getSize().getHeight()+5, frameWidth-25,(int)(frameHeight*0.7));
		tabela.setFont(myFont);
		tabela.setRowHeight(30);
		frame.add(tabela);
		frame.setVisible(true);
		frame.requestFocus();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Back")) {
			frame.setVisible(false);
			CalcGUI.setVisible();
		}
	}
	
	private void preencherTabela() {
		
		histController.list()
		.forEach((Integer i,Expressao e)->{
			modelo.addRow(new Object[] {i,	e.getExp().getExpressionString(),	e.getResposta()});
		});
	}

}
