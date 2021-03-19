package com.piantada.store.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "plushieitem")
public class PlushieItem implements Serializable {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	
	//@OneToOne         // is it already inferred? 
	//@JoinColumn(name="plushie_id")
	private Plushie plushie;
	
	//@ManyToMany(fetch= FetchType.LAZY) // lazy is for performance
	//@JoinColumn(name="user_id")
	//private User user;
	private Double price;
	private Integer ammount;
	
	
	public PlushieItem() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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




