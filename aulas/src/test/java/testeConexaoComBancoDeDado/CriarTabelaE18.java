package testeConexaoComBancoDeDado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CriarTabelaE18 {

	private Statement statment;
	private String user;
	private String driver;
	private String password;
	private String fonte;
	private Connection connection;
	private String connectionStatus;
	
	public CriarTabelaE18() {
		this.driver = "org.postgresql.Driver";
		this.password = "1234567bobi";
		this.user = "postgres";
		this.fonte = "jdbc:postgresql://localhost:5432/AulasJava";
	}

	public CriarTabelaE18(String user, String password) {
		this.driver = "org.postgresql.Driver";
		this.password = password;
		this.fonte = "jdbc:postgresql://localhost:5432/AulasJava";
		this.user = user;
	}
	
	public void conectar() {
		try {
			Class.forName(driver);
			System.out.println(user);
			this.connection = DriverManager.getConnection(fonte, user, password);
			this.connectionStatus = "Conectado";
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void desconectar() {
		try {
			Class.forName(driver);
			setConnectionStatus("Não conectado");
			statment.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createDatabaseTable(String tableName) {
		if(tableName == null) {
			return;
		}
		
		String sentenceSQL = "CREATE TABLE " + tableName + "();";
		try {
			this.statment = this.connection.createStatement();
			this.statment.executeUpdate(sentenceSQL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createCollumnDatabaseTable(String tableName,String collumnName,String dataType) {
		if(tableName == null) {
			return;
		}
		
		String sentenceSQL = "ALTER TABLE " +tableName+" ADD COLUMN "+collumnName+ " " + dataType+";";
		try {
			this.statment = this.connection.createStatement();
			this.statment.executeUpdate(sentenceSQL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCollumnDatabaseTable(String tableName,String collumnName) {
		if(tableName == null) {
			return;
		}
		
		String sentenceSQL = "ALTER TABLE " + tableName+ " DROP COLUMN "+collumnName+ ";";
		try {
			this.statment = this.connection.createStatement();
			this.statment.executeUpdate(sentenceSQL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createDatabaseBySQL(String sentenceSQL) {
		try {
			this.statment = this.connection.createStatement();
			this.statment.executeUpdate(sentenceSQL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public void setSenha(String senha) {
		this.password = senha;
	}
}
