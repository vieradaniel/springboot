package com.piantada.store.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart implements Serializable {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	
	@OneToMany(
			cascade = CascadeType.ALL, 
			orphanRemoval = true
	)
	@JoinColumn(name = "plushieitem_id")
	private List<PlushieItem> plushieItems;
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<PlushieItem> getPlushieItems() {
		return plushieItems;
	}

	public void setPlushieItems(List<PlushieItem> plushieItems) {
		this.plushieItems = plushieItems;
	}
	
	
	
}
