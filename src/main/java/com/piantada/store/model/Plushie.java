package com.piantada.store.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	public class Plushie implements Serializable{
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Id
		private Long id;	
		@Column(name="name", length = 50)
		private String name;
		private Double price;
		
		
		private String category; // this can be a class
		private Integer ammount;
		
			
		public Plushie() {
			// TODO Auto-generated constructor stub
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Double getPrice() {
			return price;
		}


		public void setPrice(Double price) {
			this.price = price;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public Integer getAmmount() {
			return ammount;
		}


		public void setAmmount(Integer ammount) {
			this.ammount = ammount;
		}
		
		
		
	
}

