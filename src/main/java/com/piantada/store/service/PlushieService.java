package com.piantada.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piantada.store.model.Plushie;
import com.piantada.store.repo.PlushieRepo;



@Service
public class PlushieService {
	@Autowired
	private PlushieRepo repo;
	
	public List<Plushie> listAll(){
		return repo.findAll();
		
	}
	
	public void save(Plushie plushie) {
		repo.save(plushie);
	}
	
	public Optional<Plushie> get(Long id) {
		return repo.findById(id);
	}
	
	
	
	public void delete (Long id) {
		repo.deleteById(id);
	}
	
	
}
