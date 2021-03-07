package com.piantada.store.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Persona implements Serializable {
	
	@Id
	private String apellido;
	@Id
	private String nombre;
	@OneToMany
	private List<Telefono> telefono;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
