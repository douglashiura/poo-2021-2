package tiposJOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowConfirmDialog {
	
	public static void main(String[] args) {
		// exibe uma janela de confirmacao;
		// tem como retorno, um int;
		// oferece os botoes padrão;
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		// argumentos: (componente onde será exibido/ conteudo da caixa/ titulo da caixa/ tipo de opcao de botao);
		JOptionPane.showConfirmDialog(frame, "Seu telefone está correto?", "Confirmação", JOptionPane.YES_NO_OPTION);
	}

}
