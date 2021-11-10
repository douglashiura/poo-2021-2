package br.ies.aula.controledenotas.visao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import br.ies.aula.controledenotas.controle.ControleJanelaNotas;
import br.ies.aula.controledenotas.controle.ControleJanelaPrincipal;
import br.ies.aula.controledenotas.modelo.Ano;
import br.ies.aula.controledenotas.modelo.JDoubleField;
import br.ies.aula.controledenotas.modelo.LimitaCaracter;
import br.ies.aula.controledenotas.modelo.Materia;
import br.ies.aula.controledenotas.modelo.RegistroNota;
import br.ies.aula.controledenotas.modelo.RegistroNotaBD;
import br.ies.aula.controledenotas.modelo.Usuario;

public class JanelaNotas extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JTable tabela;
	private Usuario usuario;

		public static void main(String[] args) {
			new JanelaNotas(null);
		}
		
		public JanelaNotas(Usuario usuario) {
			this.usuario = usuario;
			configurarTela();
			montarTela();
			setVisible(true);
		}

		private void configurarTela() {
			setTitle("Registros - Nota");		
			setSize(380, 420);
			getContentPane().setLayout(null);
		}
		
		private void montarTela() {
			montarTabela();
		}

		private void montarTabela() {
			Container container = getContentPane();
			container.setLayout(new BorderLayout());
			tabela = new JTable();
			tabela.setModel(new DefaultTableModel( new Object [][] { },
			new String [] { "Aluno", "Matricula", "Matéria", "Ano", "Nota Um", "Recuperação Um", "Nota Dois", "Recuperação Dois", "Média" }));
			
			tabela = new RegistroNotaBD().pesquisar(usuario, tabela);
			
			JScrollPane rolagemTabela = new JScrollPane(tabela);
			container.add(rolagemTabela, "Center");
			
		}
}
