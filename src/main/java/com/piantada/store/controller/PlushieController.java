package com.piantada.store.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/catalogo")
	public String listView(Model model) {
		
		List<Plushie> plushieList = service.listAll();
		model.addAttribute("plushies",plushieList);
		
		return "listView";
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
	/*
	 * Algo así sería con @PostMapping
	 @PostMapping("/save")
	 public String savePlushie(plushie){
	 	service.save(plushie);
	 }
	 * */
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditPlushieForm(@PathVariable(name= "id") Long id) {
		
		ModelAndView mav = new ModelAndView("edit_plushie");
		Optional<Plushie> plushie = service.get(id);
		mav.addObject("plushie", plushie);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deletePlushie(@PathVariable (name="id") Long id){
		service.delete(id);
		return "redirect:/";
	}
	/*
	@RequestMapping("/view/{id}")
	public ModelAndView showPlushie(@PathVariable(name= "id") Long id) {
		
		ModelAndView mav = new ModelAndView("view_plushie");
		Optional<Plushie> plushie = service.get(id);
		
		mav.addObject("plushie", plushie);
		
		return mav;
	}
	*/
	
	
	@RequestMapping("/view/{id}")
	public String view(@PathVariable Long id, Model model) {
		
		service.get(id).ifPresent(plushie -> model.addAttribute("plushie", plushie));		
		return "view_plushie";
	}
	/*
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@RequestMapping("/view/{id}")
	public String view(@PathVariable Long name, Model model) {
		
		service.get(name).ifPresent(plushie -> model.addAttribute("plushie", plushie));		
		return "view_plushie";
	}
	
	*/
	
	@GetMapping("/{name}")
	public String view(@PathVariable String name, Model model) {
		
		
		Plushie plushie = service.listByName(name);	
		model.addAttribute("plushie",plushie);
		
		
		return "view_plushie";
	}
	/*
	@GetMapping("/{category}")
	public String view(@PathVariable String name, Model model) {
		
		
		Plushie plushie = service.listByName(name);	
		model.addAttribute("plushie",plushie);
		
		
		return "view_plushie";
	}
	*/
}