package testeconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import JTable.Model;
import JTable.Pessoa;

public class ConexaoBD {
	
	public Connection conectar() throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "3242");
	}
		
	public Connection conectarEx18(String s) throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", s, "3242");
	}

	public void criarNovaTabela(JTextField nmTabela) throws SQLException {
		Connection con = conectar();
		PreparedStatement stm = con.prepareStatement("CREATE TABLE "+nmTabela.getText()+"()");
		stm.execute();
		stm.close();
		con.close();
		
	}
	
	public JTable popularTabelaPessoa() throws Exception {
		Connection con = conectar();
    	PreparedStatement stm = con.prepareStatement("SELECT * FROM pessoa order by codigo asc");
    	ResultSet rs = stm.executeQuery();
    	
    	String[] nomeColunas = {"Codigo", "Nome", "Email"};
    	List<Pessoa> listaPessoas = new ArrayList<>();
    	
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
    	
    	JTable tabela = new JTable();
    	tabela.setModel(new Model(listaPessoas, nomeColunas));
    	
    	return tabela;
    }
	
	public void inserirColuna(JTextField nmTabela, JTextField nmColuna, JTextField tipoDado) throws Exception{
		Connection con = conectar();
		PreparedStatement stm = con.prepareStatement("ALTER TABLE "+nmTabela.getText()+" ADD COLUMN "+nmColuna.getText()+" "+tipoDado.getText());
		stm.execute();
		stm.close();
		con.close();
	}
	
}
	
	
	
	
	