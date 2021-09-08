package Aulas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


public class EditorTexto extends JFrame {

	public EditorTexto()
	{
		JtextField campoTexto=new JTextField();
		campoTexto.setBounds(40,200,200,30);
		
		JTextField campoTexto2=new JTextField();
		campoTexto2.setBounds(40,300,200,30);
		
		KeyListener Teclado=new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public EditorTexto(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DocumentoEstiloso doc = new DocumentoEstiloso();
		
		tpTeste = new JTextPane();
		tpTeste.setStyledDocument(doc);
		tpTeste.addKeyListener(this);
		
		spTeste = new JScrollPane(tpTeste);
		spTeste.setPreferredSize(new Dimension(400,400));
		
		getContentPane().add(spTeste);
		
		setVisible(true);
		pack();
		
	}
	
	
	private void redStile(){
		StyleContext sc = StyleContext.getDefaultStyleContext();  
        AttributeSet aSet = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.red);  
        tpTeste.setCharacterAttributes(aSet, false);
        
	}
	
	private void blueStile(){
		StyleContext sc = StyleContext.getDefaultStyleContext();  
        AttributeSet aSet = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.blue);
        //Já descobri que se mudar para "true" onde está "false", consigo mudar todas as palavras
        //e do jeito que está o java altera apenas as próxima palavras
        tpTeste.setCharacterAttributes(aSet, false);
        
	}

	//Monitoro o teclado
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyChar() == KeyEvent.VK_SPACE){
			//Capturo o último texto digitado
			ultimoTexto = tpTeste.getText().split(" ")[tpTeste.getText().split(" ").length-1];
			redStile();
			
		}else if(arg0.getKeyChar() == KeyEvent.VK_A){
			blueStile();
		}
	}

	public void keyReleased(KeyEvent arg0) {
		
	}

	public void keyTyped(KeyEvent arg0) {
		
	}
	
	
}
