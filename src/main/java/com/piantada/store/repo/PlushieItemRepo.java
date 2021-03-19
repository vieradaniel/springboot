package com.piantada.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piantada.store.model.PlushieItem;

public interface PlushieItemRepo extends JpaRepository<PlushieItem, Long> {

}
