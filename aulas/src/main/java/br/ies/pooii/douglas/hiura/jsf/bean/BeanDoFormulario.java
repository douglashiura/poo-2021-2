package br.ies.pooii.douglas.hiura.jsf.bean;

import java.time.LocalDate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class BeanDoFormulario {
	private String texto;
	private LocalDate nascimento;

	public BeanDoFormulario() {
		texto = "Douglas 123";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void mostaOTexto() {
		System.out.println(texto);
		System.out.println(getNascimento());
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
}
