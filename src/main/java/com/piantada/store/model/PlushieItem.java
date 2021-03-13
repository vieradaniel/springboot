package com.piantada.store.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plushieitem")
public class PlushieItem implements Serializable {
	@Id
	private Integer id;
	private Plushie plushie;
	private Double price;
	private Integer ammount;
	
	
	public PlushieItem() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Plushie getPlushie() {
		return plushie;
	}


	public void setPlushie(Plushie plushie) {
		this.plushie = plushie;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getAmmount() {
		return ammount;
	}


	public void setAmmount(Integer ammount) {
		this.ammount = ammount;
	}
	
	
	
	
}




