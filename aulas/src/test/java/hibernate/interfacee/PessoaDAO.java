package hibernate.interfacee;

import java.util.List;

import hibernate.classedao.MapPessoa;

public interface PessoaDAO  {
	
		void inserir(MapPessoa pessoa);

		void deletar(MapPessoa pessoa);

		List<MapPessoa> listar();

	}

