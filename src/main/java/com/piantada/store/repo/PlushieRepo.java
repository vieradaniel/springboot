package com.piantada.store.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piantada.store.model.Plushie;

@Repository
public interface PlushieRepo extends JpaRepository<Plushie, Long> {

	
}
