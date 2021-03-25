package com.piantada.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.piantada.store.model.Customer;
import com.piantada.store.model.PlushieItem;
import com.piantada.store.service.ShoppingCartService;

@Controller
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService cartService;
	
	@GetMapping ("/cart")
	public String showShoppingCart(Model model, Customer customer) {
		
		List<PlushieItem> plushieItems = cartService.listPlushieItems(customer);
		
		return "shopping_cart";
	}
}
