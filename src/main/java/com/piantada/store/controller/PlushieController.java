package com.piantada.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savePlushie(@ModelAttribute("plushie") Plushie plushie) {
		service.save(plushie);
		
		return "redirect:/";
	}
	
	
	
	
}