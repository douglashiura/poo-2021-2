package br.ies.aula.jogo.cacaniquel.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.ies.aula.jogo.cacaniquel.modelo.Jogador;
import br.ies.aula.jogo.cacaniquel.modelo.Modelo;
import br.ies.aula.jogo.cacaniquel.visao.Visao;

public class Controlador {
	
	private Visao visao;
	private Modelo maquina;
	private Jogador jogador; 
	
	public Controlador(Visao visao, Modelo maquina) {
		
		this.visao = visao;
		this.maquina = maquina;
		this.visao.getTelaLogin().getBtnEntrar().addActionListener(new AcaoBtnEntrar());
		this.visao.getTelaInicial().getBtn1().addActionListener(new AcaoDoBtnMoeda());
		this.visao.getTelaInicial().getBtn5().addActionListener(new AcaoDoBtnMoeda());
		this.visao.getTelaInicial().getBtn10().addActionListener(new AcaoDoBtnMoeda());
		this.visao.getTelaInicial().getBtnSair().addActionListener(new AcaoBtnSair());
		this.visao.getTelaPrincipal().getBtnAlavanca().addActionListener(new AcaoBtnAlavanca());
		this.visao.getTelaCartas().getBtnVoltar().addActionListener(new AcaoBtnVoltarPainelCartas());
		this.visao.getTelaPrincipal().getBtnSair().addActionListener(new AcaoBtnSair());
	}
	
	
	class AcaoBtnEntrar implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				jogador = new Jogador();
				jogador.setId(Integer.valueOf(visao.getTelaLogin().getTxtCPF().getText()));
				jogador.setNome(visao.getTelaLogin().getTxtNome().getText());
				
				String mensagem = maquina.cadastrarJogador(jogador);
				
				visao.addTelaInicial();
				JOptionPane.showMessageDialog(visao, mensagem, null, JOptionPane.INFORMATION_MESSAGE);
				
			}catch(Exception e1){
				e1.printStackTrace();
				JOptionPane.showMessageDialog(visao, "Verifique as informações inseridas!", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	class AcaoDoBtnMoeda implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			jogador.setDinheiro(Integer.valueOf(e.getActionCommand()));
			maquina.trocarDinheiroPorFicha(jogador.getDinheiro());

			visao.getTelaPrincipal().getLabelFichas().setText("Você possui: "+jogador.getFichas()+" fichas.");
			visao.addTelaPrincipal();
		}
	}
	
	class AcaoBtnAlavanca implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (maquina.verificarSeJogadorTemFichas()) {
				
				visao.getTelaCartas().transmutarCartas(maquina.gerarValoresAleatorios());
				visao.getTelaCartas().getLabelResultado().setText(maquina.getResultado());
				visao.getTelaPrincipal().getLabelFichas().setText("Você possui: "+jogador.getFichas()+" fichas.");
				visao.addTelaCartas();
			}
			else {
				JOptionPane.showMessageDialog(visao, "Suas fichas acabaram!");
			}
		}
	}	

	class AcaoBtnVoltarPainelCartas implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			visao.addTelaPrincipal();
		}
	}

	class AcaoBtnSair implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			maquina.reembolsarJogador(jogador);
			visao.addTelaLogin();
		}
	}

	
	
	
}
