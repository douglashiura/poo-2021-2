package br.ies.sim.caixa.eletronico.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import br.ies.sim.caixa.eletronico.conexao.Conexao;

public class ContaDAO {
	public static void criarConta(Conta conta) {
		Connection conn = Conexao.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = conn.prepareStatement(
					"INSERT INTO CLIENTE (nome_cli,numero_con, senha_con, saldo_con)" + " VALUES (?, ?, ?, ?)");
			stmt.setString(1, conta.getNomeCliente());
			stmt.setInt(2, conta.getNumeroConta());
			stmt.setInt(3, conta.getSenhaConta());
			stmt.setDouble(4, conta.getSaldoConta());

			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Conexao.closeConnection(conn, stmt);
		}
	}

	public static boolean logarConta(int nmrConta, int senha) {
		Connection conn = Conexao.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = conn.prepareStatement("SELECT * FROM CLIENTE " + "WHERE numero_con = ? and senha_con = ? ");
			stmt.setInt(1, nmrConta);
			stmt.setInt(2, senha);
			ResultSet rs = stmt.executeQuery();
			Conta conta = new Conta();
			if (rs != null && rs.next()) {
				conta.setNumeroConta(rs.getInt("numero_con"));
				conta.setSenhaConta(rs.getInt("senha_con"));
				if (conta.getNumeroConta() == nmrConta && conta.getSenhaConta() == senha) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			Conexao.closeConnection(conn, stmt);
		}
	}

	public static Conta getInfoConta(int nmrConta) {
		Connection conn = Conexao.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement("SELECT * FROM CLIENTE  " + "WHERE numero_con = ?");
			stmt.setInt(1, nmrConta);
			rs = stmt.executeQuery();
			Conta contaRetorno = new Conta();
			if (rs != null && rs.next()) {
				contaRetorno.setIdConta(rs.getInt("id_conta"));
				contaRetorno.setNumeroConta(rs.getInt("numero_con"));
				contaRetorno.setNomeCliente(rs.getString("nome_cli"));
				contaRetorno.setSenhaConta(rs.getInt("senha_con"));
				contaRetorno.setSaldoConta(rs.getDouble("saldo_con"));
				return contaRetorno;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Conexao.closeConnection(conn, stmt, rs);
		}
		return null;
	}

	public static ArrayList<Integer> getNmrConta() {
		Connection conn = Conexao.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Integer> id = new ArrayList<>();
		
		try {
			stmt = conn.prepareStatement("SELECT * FROM CLIENTE");
			rs = stmt.executeQuery();
			while (rs.next()) {
				id.add(rs.getInt("numero_con"));
			}
			// System.out.println(id.get(1));
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			Conexao.closeConnection(conn, stmt, rs);
		}
	}

	public static boolean atualizarValor(Conta conta, double valor) {
		Connection conn = Conexao.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("UPDATE CLIENTE SET saldo_con = ? WHERE numero_con = ?");
			stmt.setDouble(1, valor);
			stmt.setInt(2, conta.getNumeroConta());
			stmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			Conexao.closeConnection(conn, stmt);
		}
	}
}