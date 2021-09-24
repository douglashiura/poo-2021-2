package tec.nnilux.dao;

import tec.nnilux.model.Equipamento;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

public class EquipamentoDAO {

	public void cadastrarEquipamento(Equipamento equipamento) throws ExceptionDAO {

		String sql = "insert into equipamento (nome,tipo)values (?,?)";
		PreparedStatement stmt = null;
		Connection connection = null;
		
        try {
            connection = (Connection) new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, equipamento.getNome());
            stmt.setString(2, equipamento.getTipo());
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDAO("ERRO AO CADASTRAR O PROFISSIONAL:" + e);

        } finally {

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void alterarEquipamento(Equipamento equipamento) throws ExceptionDAO {

		String sql = "update equipamento set nome=?, tipo=?, where id=?";
		PreparedStatement stmt = null;
		Connection connection = null;

		try {

			connection = (Connection) new ConexaoBD().getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, equipamento.getNome());
			stmt.setString(2, equipamento.getTipo());
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExceptionDAO("ERRO AO ALTERAR OS DADOS" + e);

		} finally {

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void excluirEquipamento(int id) throws ExceptionDAO {

		String sql = "delete from equipamento where id=?";
		PreparedStatement stmt = null;
		Connection connection = null;

		try {

			connection = (Connection) new ConexaoBD().getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExceptionDAO("ERRO AO ALTERAR OS DADOS" + e);

		} finally {

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
