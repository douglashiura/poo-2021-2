package br.ies.aula.controledenotas.controle;

import java.awt.Component;
import java.util.StringTokenizer;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.ies.aula.controledenotas.modelo.ControleDeNotas;
import br.ies.aula.controledenotas.modelo.RegistroNota;
import br.ies.aula.controledenotas.modelo.RegistroNotaBD;
import br.ies.aula.controledenotas.modelo.UsuarioBD;
import br.ies.aula.controledenotas.modelo.Validacao;
import br.ies.aula.controledenotas.visao.JanelaNotas;


public class ControleJanelaPrincipal {


	private ControleDeNotas app;
	private RegistroNota registroNota;
	private Validacao validacao;

	public ControleJanelaPrincipal(RegistroNota registroNota) {
		this.app = new ControleDeNotas(registroNota);
		this.registroNota = new RegistroNota();
		validacao = new Validacao();
	}

	public void salvar(JTextField textFieldMatricula, JComboBox<?> comboBoxMaterias, JTextField textNotaUm, JTextField textNotaUmRecuperacao, JTextField textNotaDois, JTextField textNotaDoisRecuperacao, JComboBox<?> comboBoxSemestre) {
		if(validacao.validarMatricula(textFieldMatricula.getText())) {
			if(validacao.validarNotas(textNotaUm, textNotaUmRecuperacao, textNotaDois, textNotaDoisRecuperacao)) {
				if(validacao.validarCombinacao(textFieldMatricula.getText(), comboBoxMaterias, comboBoxSemestre)) {
					registroNota = definirValoresRegistroNota(textFieldMatricula, comboBoxMaterias, textNotaUm, textNotaUmRecuperacao, textNotaDois, textNotaDoisRecuperacao, comboBoxSemestre);
					app.inserirRegistroNota(registroNota);
					JOptionPane.showMessageDialog(null, "Notas cadastradas com sucesso.");
				}
				else {
					JOptionPane.showMessageDialog(null, "O aluno já tem notas para essa matéria para o ano.");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Notas erradas, são aceitas notas de 0 até 10.");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Matricula Incorreta");
		}
	}
	
	public RegistroNota definirValoresRegistroNota(JTextField textFieldMatricula, JComboBox<?> comboBoxMaterias,
			JTextField textNotaUm, JTextField textNotaUmRecuperacao, JTextField textNotaDois,
			JTextField textNotaDoisRecuperacao, JComboBox<?> comboBoxAno) {
		   
		registroNota.setAluno(new UsuarioBD().pesquisarUsuario(textFieldMatricula.getText()));
		registroNota.setMatricula(textFieldMatricula.getText());
		StringTokenizer materia = new StringTokenizer(comboBoxMaterias.getSelectedItem().toString());
		registroNota.setMateria(Integer.parseInt(materia.nextToken("-")));
		registroNota.setNotaUm(Float.parseFloat(textNotaUm.getText()));
		registroNota.setNotaUmRecuperacao(Float.parseFloat(textNotaUmRecuperacao.getText()));
		registroNota.setNotaDois(Float.parseFloat(textNotaDois.getText()));
		registroNota.setNotaDoisRecuperacao(Float.parseFloat(textNotaDoisRecuperacao.getText()));
		registroNota.setMedia(app.calculoMedia(textNotaUm, textNotaUmRecuperacao, textNotaDois, textNotaDoisRecuperacao));
		registroNota.setAno(Integer.parseInt(comboBoxAno.getSelectedItem().toString()));
		return registroNota;
	}
	
	
	
}
