package com.piantada.store.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer extends User {
	public Customer() {
		
	}
	
}
