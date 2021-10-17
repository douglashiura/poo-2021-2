package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
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
	JButton btnVoltar = new JButton("VOLTAR");
	private JLabel labelResultado = new JLabel();
	List<Integer> combinacaoResultante;
	private ImageIcon imagem0 = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\ar.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
	private ImageIcon imagem1 = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\agua.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
	private ImageIcon imagem2 = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\fogo.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
	
	
	public TelaCartas() throws InterruptedException {
	
		configuracaoTelaCartas();
		montarTela();
	}
	
	public void configuracaoTelaCartas(){
		
		setBorder(BorderFactory.createLineBorder(Color.green, 1));
		setBackground(Color.black);
		setLayout(null);
		setVisible(true);
	}
	
	public void montarTela() {
		
		labelResultado.setBounds(360, 150, 600, 40);
		labelResultado.setForeground(Color.white);
		labelResultado.setFont(new Font("Courier New", Font.BOLD, 30));
		labelResultado.setVisible(true);
		
		btnVoltar.setBounds(1100, 350, 120, 120);
		btnVoltar.setFont(new Font("Verdana", Font.BOLD, 15));
		btnVoltar.setBackground(Color.black);
		btnVoltar.setForeground(Color.white);
		btnVoltar.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnVoltar.setVisible(true);
		
		carta1.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
		carta1.setBounds(300, 250, 200, 300);
		carta1.setVisible(true);
		
		carta2.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		carta2.setBounds(515, 250, 200, 300);
		carta2.setVisible(true);
		
		carta3.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		carta3.setBounds(730, 250, 200, 300);
		carta3.setVisible(true);
		
		add(carta1);
		add(carta2);
		add(carta3);
		add(btnVoltar);
		add(labelResultado);
	}

	public void transmutarCartas(List<Integer> listaCombinacoes) {
			
		decidirImagemDaCarta1(listaCombinacoes.get(0), 0);
		decidirImagemDaCarta2(listaCombinacoes.get(1), 1);
		decidirImagemDaCarta3(listaCombinacoes.get(2), 2);
	}
	
	public void decidirImagemDaCarta1(Integer valorAleatorio, int index) {
		
		switch (index) {
		case 0:
			if (valorAleatorio == 0) {
				carta1.setIcon(imagem0);
				carta1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			}
				else if (valorAleatorio == 1) {
					carta1.setIcon(imagem1);
					carta1.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
				}else {
					carta1.setIcon(imagem2);
					carta1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				} 
		}	
	}
	
	public void decidirImagemDaCarta2(Integer valorAleatorio, int index) {
		
		switch (index) {
		case 1:
			if (valorAleatorio == 0){
				carta2.setIcon(imagem0);
				carta2.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			}
				else if (valorAleatorio == 1) {
					carta2.setIcon(imagem1);
					carta2.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
				}else {
					carta2.setIcon(imagem2);
					carta2.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
		}
	}
	
	public void decidirImagemDaCarta3(Integer valorAleatorio, int index) {
		
		switch (index) {
		case 2:
			if (valorAleatorio == 0) {
				carta3.setIcon(imagem0);
				carta3.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			}
				else if (valorAleatorio == 1) {
					carta3.setIcon(imagem1);
					carta3.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
				}else {
					carta3.setIcon(imagem2);
					carta3.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
		}
	}
	
	
	
	public JButton getBtnVoltar() {
		
		return btnVoltar;
	}
	
	public JLabel getLabelResultado() {
		
		return labelResultado;
	}

	

	
}
