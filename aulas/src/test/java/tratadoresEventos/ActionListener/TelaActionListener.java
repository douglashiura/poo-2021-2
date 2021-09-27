package tratadoresEventos.ActionListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import tratadoresEventos.WindowListener.TratadorEventoWindowAdapter;

public class TelaActionListener extends JFrame{
	private static final long serialVersionUID = 1L;

	public TelaActionListener() {
		setVisible(true);
		setSize(500, 600);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(Color.black);
		botoes();
		addWindowListener(new TratadorEventoWindowAdapter());
	}
		
	public void botoes() {
		
		JButton botao = new JButton("OK");
		botao.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				System.out.println("O botao 1 foi apertado!");
				JOptionPane.showMessageDialog(botao, "Apertou botao 1");
			} });
		
		JButton botao2 = new JButton("CANCEL");
		botao2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(botao, "Apertou botao 2");
			}});
			
		add(botao, BorderLayout.NORTH);
		add(botao2, BorderLayout.SOUTH);
	}
	
}
