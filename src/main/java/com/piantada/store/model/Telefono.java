package com.piantada.store.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefono implements Serializable{
	@Id
	private Integer codigo;
	@Id
	private Integer numero;
	
	
	public Telefono() {
		// TODO Auto-generated constructor stub
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
}
