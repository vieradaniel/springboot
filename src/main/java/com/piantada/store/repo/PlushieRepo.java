package com.piantada.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piantada.store.model.Plushie;

public interface PlushieRepo extends JpaRepository<Plushie, Integer> {

}
