package JTable;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

	
	public class JayTablee extends JFrame {
		private static final long serialVersionUID = 1L;
		JPanel painel;
		JTable tabela = new JTable();
		JScrollPane barraRolagem = new JScrollPane();
		String[] colunas = {"codigo", "nome", "email"};
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		public JayTablee() throws Exception {
	        super ("Pessoas");
	       
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setSize(500, 120);
	        setVisible(true);
	        painel = new JPanel();
	        getContentPane().add(painel);
	        
	        painel.setLayout(new GridLayout(1, 1));
	        popularTabela();
	       
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

