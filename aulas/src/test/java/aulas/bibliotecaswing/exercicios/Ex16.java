package aulas.bibliotecaswing.exercicios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import testeconexao.ConexaoBD;

public class Ex16 extends JFrame{
	private static final long serialVersionUID = 1L;
	JPanel painel = new JPanel();
	JPanel painelBotoes = new JPanel();
	JScrollPane barraRolagem = new JScrollPane();
	JButton botaoIncluir = new JButton("Incluir");
	JButton botaoExcluir = new JButton("Excluir");
	JButton botaoMostrar = new JButton("Mostrar");
	
	Ex16() throws Exception{
		
		botoes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
		setVisible(true);
	}
	
	public void botoes() {
		painelBotoes.setLayout(new FlowLayout());
        painelBotoes.add(botaoIncluir);
        painelBotoes.add(botaoExcluir);
        painelBotoes.add(botaoMostrar);
        
        botaoMostrar.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				try {
					JScrollPane barraRolagem = new JScrollPane(new ConexaoBD().popularTabelaPessoa());
					barraRolagem.setPreferredSize(new Dimension(900, 500));
			    	painel.add(barraRolagem);
			    	
					getContentPane().add(painel);
					painel.revalidate();
					
					botaoMostrar.setEnabled(false);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} });
        
        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
	}
    	

}
