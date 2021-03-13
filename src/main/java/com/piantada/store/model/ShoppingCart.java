package com.piantada.store.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart implements Serializable {
	@Id
	private Integer id;
	
	@OneToMany(
			cascade = CascadeType.ALL, 
			orphanRemoval = true
	)
	@JoinColumn(name = "plushieitem_id")
	private List<PlushieItem> plushieItems;
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}
	
}
