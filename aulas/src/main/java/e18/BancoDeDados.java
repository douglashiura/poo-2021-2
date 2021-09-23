package e18;

import java.sql.*;

public class BancoDeDados {
	private String user;
	private String senha;
	private Connection c;
	private Statement statment;
	private String str_conexao;
	private String driverjdbc;

	public BancoDeDados() {
		this.str_conexao = "jdbc:postgresql://localhost:5432/teste";
		this.user  = "teste";
  		this.senha = "200803";
  		this.driverjdbc = "org.postgresql.Driver";
  	}

	public void conect(){
		try {
			Class.forName(getDriverjdbc());
			setC(DriverManager.getConnection(getStr_conexao(), getUser(), getSenha()));
			setStatment(getC().createStatement());
		}catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	public void disconect(){
		try {
			getC().close();
		}catch (SQLException ex) {
			System.err.println(ex);
			ex.printStackTrace();
		}
	}
	
	public void insert(String query){
		try {
			getStatment().executeQuery(query);
		}catch (SQLException ex) {
			
		}
	}
	
	public String selectName(String query){
		try {
			 ResultSet rs = getStatment().executeQuery(query);
			 return resultadoName(rs);
		}catch (SQLException ex) {
			
		}
		return null;
	}
	
	public String resultadoName(ResultSet rs) throws SQLException{
		while(rs.next()) {
			if(rs.isLast()) {		
				String player1 = rs.getString("nm_jogador");
				return player1;
			}
		}
		return null;
	}	

	public String selectId(String query){
		try {
			 ResultSet rss = getStatment().executeQuery(query);
			 return resultadoId(rss);
		}catch (SQLException ex) {
			
		}
		return null;
	}
	
	public String resultadoId(ResultSet rss) throws SQLException{
		while(rss.next()) {
			if(rss.isLast()) {		
				String id = rss.getString("MAX");
				return id;
			}
		}
		return null;
	}	

	
	public String getUser() {
		return user;
	}

	public String getSenha() {
		return senha;
	}

	public Connection getC() {
		return c;
	}

	public void setC(Connection c) {
		this.c = c;
	}

	public Statement getStatment() {
		return statment;
	}

	public void setStatment(Statement statment) {
		this.statment = statment;
	}

	public String getStr_conexao() {
		return str_conexao;
	}


	public String getDriverjdbc() {
		return driverjdbc;
	}

}