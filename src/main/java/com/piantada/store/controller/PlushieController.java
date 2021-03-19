package com.piantada.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.piantada.store.model.Plushie;
import com.piantada.store.repo.PlushieRepo;


//@RestController        esto para que sea Restcontroller
//@RequestMapping("/api/clients")  ??
@Controller  // esto es para un standalone.
public class PlushieController {

	@Autowired
	private PlushieRepo repo;
	
	@GetMapping("/")
	public String greeting (@RequestParam(name="name", required = false, defaultValue = "World") String name,Model model) {
		
		// path param or request param? con thymeleaf
		//esta logica se tiene que encapsular en un paquete service? huh?
		//Plushie plushie = new Plushie();
		
		//plushie.setName("Batman");
		//repo.save(plushie);
		//hasta acá
		model.addAttribute("name",name);
		return "index";
	}
	@GetMapping("/catalogo")
	public String greeting (Model model) {
				
		model.addAttribute("plushies",repo.findAll());
		return "listView";
	}
	
}