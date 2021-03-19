package com.piantada.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piantada.store.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
