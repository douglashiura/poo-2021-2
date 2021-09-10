package tec.nnilux.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaCadastroItem extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public TelaCadastroItem() {
		
		this.setTitle("Nilux Technology - Outsourcing de TI");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setLocationRelativeTo(null);

		JPanel painel = new JPanel(null);
		
		JLabel labelCabecalhoCadastroItem = new JLabel("CADASTRO DE ITENS");
		labelCabecalhoCadastroItem.setBounds(50, 30, 260, 60);
		labelCabecalhoCadastroItem.setFont(new Font("Arial", Font.BOLD, 16));
		painel.add(labelCabecalhoCadastroItem);
		
		getContentPane().add(painel);
		this.setVisible(true);

	}
	public static void main (String []args) {
		new TelaCadastroItem();
	}
}
