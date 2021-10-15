package hibernate.interfacee;

import hibernate.classedao.Rodada;

public interface RodadaDAO {

	void inserir(Rodada rodada);
	Rodada encontar(Integer id);
	
}