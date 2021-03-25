package com.piantada.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piantada.store.model.Customer;
import com.piantada.store.model.PlushieItem;
import com.piantada.store.repo.PlushieItemRepo;

@Service
public class ShoppingCartService {
	
	@Autowired
	private PlushieItemRepo cartRepo;
	
	public List<PlushieItem> listPlushieItems(Customer customer){
		return cartRepo.findByCustomer(customer);
	}
	

}
