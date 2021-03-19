package com.piantada.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.piantada.store.model.Plushie;
import com.piantada.store.repo.PlushieRepo;
import com.piantada.store.service.PlushieService;


//@RestController        esto para que sea Restcontroller
//@RequestMapping("/api/clients")  ??
@Controller  // esto es para un standalone.
public class PlushieController {

	@Autowired
	private PlushieService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		
		List<Plushie> plushieList = service.listAll();
		model.addAttribute("plushies",plushieList);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewPlushieForm(Model model) {
		
		Plushie plushie = new Plushie();
		model.addAttribute("plushie", plushie);
		
		return "new_plushie";
	}
	
	
	
	
	
	/*@PostMapping("/catalogo")
	public String greeting (@RequestParam(name="name", required = false, defaultValue = "World") String name,Model model) {
		
		// path param or request param? con thymeleaf
		//esta logica se tiene que encapsular en un paquete service? huh?
		Plushie plushie = new Plushie();
		
		plushie.setName(name);
		repo.save(plushie);
		//hasta acá
		model.addAttribute("name",name);
		return "addPlushie";
	}
	
	
	@GetMapping("/catalogo")
	public String greeting (Model model) {
				
		model.addAttribute("plushies",repo.findAll());
		return "listView";
	}*/
	
}