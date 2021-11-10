package br.ies.aula.controledenotas.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.controledenotas.modelo.ControleDeNota;
import br.ies.aula.controledenotas.modelo.RegistroNota;
import br.ies.aula.controledenotas.modelo.Usuario;
import br.ies.aula.controledenotas.visao.JanelaNotas;
import br.ies.aula.controledenotas.visao.JanelaPrincipal;

public class ControleJanelaNotas implements ActionListener {

	public ControleJanelaNotas() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new JanelaNotas(null);
		
	}
	
}
