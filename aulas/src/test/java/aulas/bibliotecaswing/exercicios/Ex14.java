package aulas.bibliotecaswing.exercicios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex14 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton botao0 = new JButton("0");
	JButton botao1 = new JButton("1");
	JButton botao2 = new JButton("2");
	JButton botao3 = new JButton("3");
	JButton botao4 = new JButton("4");
	JButton botao5 = new JButton("5");
	JButton botao6 = new JButton("6");
	JButton botao7 = new JButton("7");
	JButton botao8 = new JButton("8");
	JButton botao9 = new JButton("9");
	JButton botaoSoma = new JButton("+");
	JButton botaoSubtrai = new JButton("-");
	JButton botaoMultiplica = new JButton("*");
	JButton botaoDivide = new JButton("/");
	JButton botaoLimparTudo = new JButton("C");
	JButton botaoIgual = new JButton("=");
	JButton botaoPonto = new JButton(".");
	JTextField cxTexto = new JTextField(13);
	JPanel painel = new JPanel();
	private double resultado;
	private double numero =0;
	private double numero2=0;
	private String operador;
	

	public Ex14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(220, 230);
		setResizable(false);
		setVisible(true);
		painel.setLayout(new FlowLayout());
		botoes();
		
		getContentPane().add(painel);
		revalidate();
		
	}
	
		public void botoes() {
			
			botao0.addActionListener(new ListenerBotoesNumeros());
			botao1.addActionListener(new ListenerBotoesNumeros());
			botao2.addActionListener(new ListenerBotoesNumeros());
			botao3.addActionListener(new ListenerBotoesNumeros());
			botao4.addActionListener(new ListenerBotoesNumeros());
			botao5.addActionListener(new ListenerBotoesNumeros());
			botao6.addActionListener(new ListenerBotoesNumeros());
			botao7.addActionListener(new ListenerBotoesNumeros());
			botao8.addActionListener(new ListenerBotoesNumeros());
			botao9.addActionListener(new ListenerBotoesNumeros());
			botaoPonto.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cxTexto.setText(cxTexto.getText()+".");
				}
			});
			botaoSoma.addActionListener(new ListenerBotoesOperadores());
			botaoSubtrai.addActionListener(new ListenerBotoesOperadores());
			botaoDivide.addActionListener(new ListenerBotoesOperadores());
			botaoMultiplica.addActionListener(new ListenerBotoesOperadores());
			botaoIgual.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setNumero2(Double.parseDouble(cxTexto.getText()));
					realizarOperacao(getNumero(), getNumero2());
					setNumero(0);
					setNumero2(0);
				}
			});
			botaoLimparTudo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					limparTudo();
				}
			});
			
			painel.add(cxTexto);
			painel.add(botaoLimparTudo);
			painel.add(botao7);
			painel.add(botao8);
			painel.add(botao9);
			painel.add(botaoDivide);
			painel.add(botao4);
			painel.add(botao5);
			painel.add(botao6);
			painel.add(botaoMultiplica);
			painel.add(botao1);
			painel.add(botao2);
			painel.add(botao3);
			painel.add(botaoSubtrai);
			painel.add(botao0);
			
			painel.add(botaoIgual);
			painel.add(botaoSoma);
			painel.add(botaoPonto);
		}
		
		
		public void realizarOperacao(double n1, double n2) {
			
			if (getOperador()=="+") {
				setResultado(n1 + n2);
				cxTexto.setText(Double.toString(getResultado()));
			}
			else if (getOperador()=="-") {
				setResultado(n1 - n2);
				cxTexto.setText(Double.toString(getResultado()));
			}
			else if(getOperador()=="/") {
				setResultado(n1 / n2);
				cxTexto.setText(Double.toString(getResultado()));
			}
			else if (getOperador()=="*") {
				setResultado(n1 * n2);
				cxTexto.setText(Double.toString(getResultado()));
			}
		}
		
		public void setOperador(String operador) {
			this.operador = operador;
		}
		public String getOperador() {
			return operador;
		}
		
		public void limparTudo() {
			cxTexto.setText(null);
			setOperador("");
			setNumero(0);
			setNumero2(0);
		}
		
		public double getNumero() {
			return numero;
		}
		public void setNumero(double numero) {
			this.numero = numero;
		}
		
		public double getNumero2() {
			return numero2;
		}
		public void setNumero2(double numero2) {
			this.numero2 = numero2;
		}
		
		public double getResultado() {
			return resultado;
		}
		public void setResultado(double resultado) {
			this.resultado = resultado;
		}
		
		private class ListenerBotoesNumeros implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				cxTexto.setText(cxTexto.getText()+e.getActionCommand());

				
			}
		}
		private class ListenerBotoesOperadores implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				setOperador(e.getActionCommand());
				setNumero(Double.parseDouble(cxTexto.getText()));
				cxTexto.setText("");
				
			}
		}
		
}
