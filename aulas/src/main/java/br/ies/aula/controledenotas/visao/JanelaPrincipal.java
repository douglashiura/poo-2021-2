package br.ies.aula.controledenotas.visao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.ies.aula.controledenotas.controle.ControleJanelaApp;
import br.ies.aula.controledenotas.modelo.RegistroNota;

public class JanelaPrincipal extends JFrame {
	
private static final long serialVersionUID = 1L;
	

private JPanel panelPrincipal;
private JLabel labelMateria;
private JLabel labelNotaUm;
private JLabel labelNotaUmRecuperacao;
private JLabel labelNotaDois;
private JLabel labelNotaDoisRecuperacao;
private JLabel labelMatricula;
private JTextField textNotaUm;
private JTextField textNotaUmRecuperacao;
private JTextField textNotaDois;
private JTextField textNotaDoisRecuperacao;
private JTextField textFieldMatricula;
private JComboBox<?> comboBoxMaterias;
	
	private ControleJanelaApp controle;
	
	public static void main(String[] args) {
		new JanelaPrincipal(null);
	}
	
	public JanelaPrincipal(RegistroNota registroNota) {
		configurarTela();
		montarTela();
		this.controle = new ControleJanelaApp(null, registroNota);
		setVisible(true);
		controle.iniciarApp();
	}

	private void configurarTela() {
		setTitle("Cadastro - Nota");		
		setSize(380, 420);
		getContentPane().setLayout(null);
	}
	
	private void montarTela() {
		montarPanelPrincipal();
		montarLabels();
		montarFields();
		montarBotoes();
	}

	private void montarPanelPrincipal() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(20, 11, 330, 350);
		panelPrincipal.setLayout(null);
		
		getContentPane().add(panelPrincipal);
	}

	private void montarLabels() {
		
		labelMatricula = new JLabel("Matricula:");
		labelMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelMatricula.setHorizontalAlignment(SwingConstants.LEFT);
		labelMatricula.setBounds(25, 110, 75, 15);
		
		labelMateria = new JLabel("Matéria:");
		labelMateria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelMateria.setHorizontalAlignment(SwingConstants.LEFT);
		labelMateria.setBounds(25, 140, 75, 15);
		
		labelNotaUm = new JLabel("Primeira Nota:");
		labelNotaUm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNotaUm.setHorizontalAlignment(SwingConstants.LEFT);
		labelNotaUm.setBounds(25, 170, 210, 15);
		
		labelNotaUmRecuperacao = new JLabel("Recuperação da Nota:");
		labelNotaUmRecuperacao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNotaUmRecuperacao.setHorizontalAlignment(SwingConstants.LEFT);
		labelNotaUmRecuperacao.setBounds(25, 200, 210, 15);
		
		labelNotaDois = new JLabel("Segunda Nota:");
		labelNotaDois.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNotaDois.setHorizontalAlignment(SwingConstants.LEFT);
		labelNotaDois.setBounds(25, 230, 210, 15);
		
		labelNotaDoisRecuperacao = new JLabel("Recuperação da Nota:");
		labelNotaDoisRecuperacao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNotaDoisRecuperacao.setHorizontalAlignment(SwingConstants.LEFT);
		labelNotaDoisRecuperacao.setBounds(25, 260, 210, 15);
		
		panelPrincipal.add(labelMatricula);
		panelPrincipal.add(labelMateria);
		panelPrincipal.add(labelNotaUm);
		panelPrincipal.add(labelNotaUmRecuperacao);
		panelPrincipal.add(labelNotaDois);
		panelPrincipal.add(labelNotaDoisRecuperacao);
	}

	private void montarFields() {
		
		textFieldMatricula = new JTextField();
		textFieldMatricula.setBounds(160, 105, 145, 25);
		
		String country[]={"India","Aus","U.S.A","England","Newzealand"};        
		comboBoxMaterias = new JComboBox(country);
		comboBoxMaterias.setBounds(160, 135, 145, 25);
		
		textNotaUm = new JTextField();
		textNotaUm.setBounds(160, 165, 145, 25);
		
		textNotaUmRecuperacao = new JTextField();
		textNotaUmRecuperacao.setBounds(160, 195, 145, 25);
		
		textNotaDois = new JTextField();
		textNotaDois.setBounds(160, 225, 145, 25);
		
		textNotaDoisRecuperacao = new JTextField();
		textNotaDoisRecuperacao.setBounds(160, 255, 145, 25);
		
		panelPrincipal.add(textFieldMatricula);
		panelPrincipal.add(comboBoxMaterias);
		panelPrincipal.add(textNotaUm);
		panelPrincipal.add(textNotaUmRecuperacao);
		panelPrincipal.add(textNotaDois);
		panelPrincipal.add(textNotaDoisRecuperacao);
		
	}

	private void montarBotoes() {
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(110, 290, 70, 25);
		botaoSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controle.salvar(textFieldMatricula, comboBoxMaterias, textNotaUm, textNotaUmRecuperacao, textNotaDois, textNotaDoisRecuperacao);
			}
			
		});
		
		JButton botaoNovoRegistro = new JButton("Nogo Registro");
		botaoNovoRegistro.setFocusable(false);
		botaoNovoRegistro.setBounds(15, 0, 95, 25);
		botaoNovoRegistro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controle.trocarAluno();
			}
			
		});
		panelPrincipal.add(botaoNovoRegistro);
		panelPrincipal.add(botaoSalvar);
	
	}

}
