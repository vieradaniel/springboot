package com.piantada.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piantada.store.model.Customer;
import com.piantada.store.model.User;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
