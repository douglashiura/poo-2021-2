package br.ies.pooii.douglas.hiura.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class BeanDoFormulario {
	private String texto;
	public BeanDoFormulario() {
		texto="Douglas 123";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void mostaOTexto() {
		System.out.println(texto);
	}
}
