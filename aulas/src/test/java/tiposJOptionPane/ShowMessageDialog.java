package tiposJOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowMessageDialog {

	public static void main(String[] args) {
		// exibe uma mensagem na janela; 
		// retorno void (sem retorno);
		// oferece um botao de ok;
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		// argumentos: (componente onde será exibido/ conteudo da caixa/ titulo da caixa/ aparencia da caixa)
		JOptionPane.showMessageDialog(frame, "Mensagem", "Titulo", JOptionPane.INFORMATION_MESSAGE);
	}
}
