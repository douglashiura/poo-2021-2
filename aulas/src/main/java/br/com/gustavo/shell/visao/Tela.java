package br.com.gustavo.shell.visao;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.Border;

public class Tela implements Configuravel {

	@Override
	public JLabel configuraComponente(JLabel componente, Font fonte, String texto, Border borda, Integer alinhamentoHorizontal) {
    	componente.setFont(fonte);
    	componente.setText(texto);
    	componente.setBorder(borda);
    	componente.setHorizontalAlignment(alinhamentoHorizontal);
    	return componente;
	}

	@Override
	public void agrupaLayout(JPanel painel) {
		GroupLayout painelLayout = new GroupLayout(painel);
        painel.setLayout(painelLayout);
        Alignment alinhamentoLeading = GroupLayout.Alignment.LEADING;
        painelLayout.setHorizontalGroup(painelLayout.createParallelGroup(alinhamentoLeading).addGap(0, 100, Short.MAX_VALUE));
        painelLayout.setVerticalGroup(painelLayout.createParallelGroup(alinhamentoLeading).addGap(0, 100, Short.MAX_VALUE));
		
	}

	@Override
	public void executaConfiguracoesIniciais(JFrame frame) {
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    	frame.setTitle("CPU");
    	frame.setBounds(new Rectangle(10, 5, 1000, 1000));
    	frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    	frame.setPreferredSize(new Dimension(485, 285));
    	frame.setSize(new Dimension(1000, 250));
    	frame.getContentPane().setLayout(null);
    	frame.setVisible(true);
	}

	@Override
	public void defineRestricoesDoComponente(JLabel componente, Integer x, Integer y, Integer largura, Integer altura) {
		componente.setBounds(x, y, largura, altura);
	}

}
