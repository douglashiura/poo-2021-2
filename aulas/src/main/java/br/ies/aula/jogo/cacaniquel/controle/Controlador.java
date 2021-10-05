package br.ies.aula.jogo.cacaniquel.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import br.ies.aula.jogo.cacaniquel.modelo.Modelo;
import br.ies.aula.jogo.cacaniquel.visao.Visao;

public class Controlador {
	private Visao visao;
	private Modelo modelo;
	
	public Controlador(Visao visao, Modelo modelo) {
		this.visao = visao;
		this.modelo = modelo;
		
		this.visao.getTelaInicial().getBtn1().addActionListener(new AcaoDoBtnMoeda());
		this.visao.getTelaInicial().getBtn5().addActionListener(new AcaoDoBtnMoeda());
		this.visao.getTelaInicial().getBtn10().addActionListener(new AcaoDoBtnMoeda());
		this.visao.getTelaPrincipal().getBtnAlavanca().addActionListener(new AcaoBtnAlavanca());
		this.visao.getTelaCartas().getBtnVoltar().addActionListener(new AcaoBtnVoltar());
	}

	
	class AcaoDoBtnMoeda implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			visao.getContentPane().removeAll();
			visao.addTelaPrincipal();
			visao.atualizarFrame();
			
			if (e.getActionCommand().equals("1")) {
				modelo.setFichas(1);
				JOptionPane.showMessageDialog(visao, "Você possui "+ modelo.getFichas()+" fichas");
			
			} 	else if (e.getActionCommand().equals("5")) {
					modelo.setFichas(5);
					JOptionPane.showMessageDialog(visao, "Você possui "+ modelo.getFichas()+" fichas");

				}	else {
						modelo.setFichas(10);
						JOptionPane.showMessageDialog(visao, "Você possui "+ modelo.getFichas()+" fichas");

					}
		}
	}

	class AcaoBtnAlavanca implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			if (modelo.getFichas() > 0) {
				
				visao.addTelaCartas();
				modelo.setFichas(modelo.getFichas()-1);
			}
		}
	
	}

	class AcaoBtnVoltar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			visao.addTelaPrincipal();
			JOptionPane.showMessageDialog(visao, "Você possui "+ modelo.getFichas()+" fichas");
		}
	}


}
