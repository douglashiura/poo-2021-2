package br.ies.aula.controledenotas.modelo;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracter extends PlainDocument {

	private static final long serialVersionUID = 1L;
	int maximo;
	  
	  public LimitaCaracter(int max){
	    maximo = max;
	  }
	 
	  public void insertString(int offs, String str, 
	          AttributeSet a) throws BadLocationException{
	    if((getLength() + str.length()) <= maximo)
	      super.insertString(offs, str, a);
	  }
}
