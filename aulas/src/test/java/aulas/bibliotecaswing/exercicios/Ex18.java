package aulas.bibliotecaswing.exercicios;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex18 extends JPanel {
	private static final long serialVersionUID = 1L;

	public Ex18(){
		configuracoes();
		panel();
		
	}
	
	public void panel() {
		
		JButton botaoConectarBanco = new JButton("Conectar banco");
		botaoConectarBanco.setBounds(400, 50, 200, 30);
		botaoConectarBanco.setVisible(true);
		
		JButton botaoDesconectarBanco = new JButton("Desconectar banco");
		botaoDesconectarBanco.setBounds(900, 50, 200, 30);
		botaoDesconectarBanco.setVisible(true);
		
		
		
		
		add(botaoConectarBanco);
		add(botaoDesconectarBanco);

	}
	
	public void configuracoes(){
		setLayout(null);
		setSize(700, 700);
		setBackground(Color.black);
		setVisible(true);
	}
	

}
