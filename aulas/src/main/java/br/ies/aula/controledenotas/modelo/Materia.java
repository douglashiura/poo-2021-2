package br.ies.aula.controledenotas.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JComboBox;

public class Materia {
	
	private Integer idMateria;
	private String nomeMateria;

	public Materia(Integer idMateria, String nomeMateria) {
		this.setIdMateria(idMateria);
		this.setNomeMateria(nomeMateria);
		
	}
	
	public static ArrayList<String> pesquisarMateria() {
		
		return new MateriaBD().pesquisarMateria();
	}

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	
	

}
