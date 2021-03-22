package com.piantada.store.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



	@Entity
	public class Plushie implements Serializable{
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Id
		private Long id;	
		@Column(name="name", length = 50)
		private String name;
		private String imageLink;
		public String getImageLink() {
			return imageLink;
		}


		public void setImageLink(String imageLink) {
			this.imageLink = imageLink;
		}


		private Double price;
		
		/*
		@OneToMany(mappedBy="plushie", cascade=CascadeType.ALL,orphanRemoval=true)
		private Set<Category> categories; // this can be a class*/
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


		public Integer getAmmount() {
			return ammount;
		}


		public void setAmmount(Integer ammount) {
			this.ammount = ammount;
		}

/*
		public Set<Category> getCategories() {
			return categories;
		}


		public void setCategories(Set<Category> categories) {
			this.categories = categories;
		}

*/
		
		
		
		
	
}

