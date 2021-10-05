package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaCartas extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel carta1 = new JLabel();
	private JLabel carta2 = new JLabel();
	private JLabel carta3 = new JLabel();
	private ImageIcon coringajpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\coringao.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
	JButton btnVoltar = new JButton("Voltar");
	
	public TelaCartas() {
		
		configuracaoTelaCartas();
		montarTela();
	}
	
	public void configuracaoTelaCartas(){
		
		this.setBorder(BorderFactory.createLineBorder(Color.green, 1));
		this.setBackground(Color.gray);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public void montarTela() {
		
		btnVoltar.setBounds(1100, 350, 120, 120);
		btnVoltar.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnVoltar.setBackground(Color.green);
		btnVoltar.setForeground(Color.black);
		btnVoltar.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnVoltar.setVisible(true);
		
		carta1.setIcon(coringajpg);
		carta1.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
		carta1.setBounds(300, 250, 200, 300);
		carta1.setVisible(true);
		
		carta2.setIcon(coringajpg);
		carta2.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		carta2.setBounds(515, 250, 200, 300);
		carta2.setVisible(true);
		
		carta3.setIcon(coringajpg);
		carta3.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		carta3.setBounds(730, 250, 200, 300);
		carta3.setVisible(true);
		
		add(carta1);
		add(carta2);
		add(carta3);
		add(btnVoltar);
		
	}
	
	public JButton getBtnVoltar() {
		
		return btnVoltar;
	}
	
	
}
