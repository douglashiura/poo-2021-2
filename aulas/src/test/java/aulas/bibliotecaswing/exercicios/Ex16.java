package aulas.bibliotecaswing.exercicios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import JTable.Model;
import JTable.Pessoa;

public class Ex16 extends JFrame{
	private static final long serialVersionUID = 1L;
	JTable tabela = new JTable();
	JPanel painel = new JPanel();
	JPanel painelBotoes = new JPanel();
	JScrollPane barraRolagem = new JScrollPane();
	JButton botaoIncluir = new JButton("Incluir");
	JButton botaoExcluir = new JButton("Excluir");
	JButton botaoMostrar = new JButton("Mostrar");
	String[] colunas = {"Codigo", "Nome", "Email"};
	List<Pessoa> listaPessoas = new ArrayList<>();
	
	Ex16() throws Exception{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
		getContentPane().setLayout(new BorderLayout());
		
		botoes();
	}
	
	public void botoes() {
		painelBotoes.setLayout(new FlowLayout());
        painelBotoes.add(botaoIncluir);
        painelBotoes.add(botaoExcluir);
        painelBotoes.add(botaoMostrar);
        
        botaoMostrar.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				try {
					popularTabela();
					botaoMostrar.setEnabled(false);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} });
        
        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
	}
	
	public void popularTabela() throws Exception {
		Connection con = conectar();
    	PreparedStatement stm = con.prepareStatement("SELECT * FROM pessoa");
    	ResultSet rs = stm.executeQuery();
    	
    	while(rs.next()){
    		Pessoa pessoa = new Pessoa();
    		pessoa.setCodigo(rs.getInt("codigo"));
    		pessoa.setNome(rs.getString("nome"));
    		pessoa.setEmail(rs.getString("email"));
    		listaPessoas.add(pessoa);
	    }
    	con.close();
    	stm.close();
    	rs.close();
    	
    	Model modelo = new Model(listaPessoas, colunas);
    	tabela.setModel(modelo);
    	barraRolagem = new JScrollPane(tabela);
    	painel.add(barraRolagem);
    	getContentPane().add(painel, BorderLayout.CENTER);
    	painel.revalidate();
    	
    }
    	
    public Connection conectar() throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "3242");
	}

}
