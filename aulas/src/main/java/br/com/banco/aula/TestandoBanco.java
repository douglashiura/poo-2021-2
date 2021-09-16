package br.com.banco.aula;

import java.io.IOException;
import java.sql.SQLException;

public class TestandoBanco {

	public static void main(String[] args) throws SQLException, IOException {
		Aluno gustavo = new Aluno(1, "Gustavo", "Ciencia da Computacao");
		Aluno nilo = new Aluno(2, "Nilo", "Publicidade");
		Aluno luiz = new Aluno(3, "Luiz", "Musico");		
		ConexaoComBancoDeDados conexao = new ConexaoComBancoDeDados();
		
		conexao.selecionarAlunos();
		conexao.selecionarAlunoEspecifico(luiz);
	}

}
