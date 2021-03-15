package com.piantada.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.piantada.store.model.Plushie;
import com.piantada.store.repo.PlushieRepo;

@Controller
public class StoreController {

	@Autowired
	private PlushieRepo repo;
	
	@GetMapping("/")
	public String greeting (@RequestParam(name="name", required = false, defaultValue = "World") String name,Model model) {
		
		
		//esta logica se tiene que encapsular en un paquete service? huh?
		Plushie plushie = new Plushie();
		plushie.setId(1);
		plushie.setName("Batman");
		repo.save(plushie);
		//hasta acá
		model.addAttribute("name",name);
		return "index";
	}
	@GetMapping("/list")
	public String greeting (Model model) {
				
		model.addAttribute("plushies",repo.findAll());
		return "index";
	}
	
}
