package br.com.gustavo.shell.visao;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public interface Configuravel {
	
	public abstract JLabel configuraComponente(JLabel componente, Font fonte, String texto, Border borda, Integer alinhamentoHorizontal);
	public abstract void agrupaLayout(JPanel painel);
	public abstract void executaConfiguracoesIniciais(JFrame frame);
	public abstract void defineRestricoesDoComponente(JLabel componente, Integer x, Integer y, Integer largura, Integer altura);

}
