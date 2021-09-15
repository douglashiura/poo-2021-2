package Aulas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeBanco {

	public static void main(String[] args) throws Exception, SQLException {
		criarTabela();
	}	
	public static Connection Conexao() throws SQLException {		
		String url = "jdbc:postgresql://localhost:5432/testedb";
		String user = "postgres";
		String senha = "ma250879";		
		return DriverManager.getConnection(url, user, senha);		
	}
	public static void criarTabela() throws SQLException {
		Connection conn = Conexao();
		String sql = "CREATE TABLE empresa (id integer CONSTRAINT pk_id PRIMARY KEY,Funcionario varchar(150) NOT NULL, Setor varchar(40) NOT NULL,Matricula integer);";
		java.sql.Statement st = conn.createStatement();
		st.executeUpdate(sql);
		conn.close();
	}
}