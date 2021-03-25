package com.piantada.store.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piantada.store.model.Customer;
import com.piantada.store.model.PlushieItem;

@Repository
public interface PlushieItemRepo extends JpaRepository<PlushieItem, Long> {

	public List<PlushieItem> findByCustomer(Customer customer);
	
}
