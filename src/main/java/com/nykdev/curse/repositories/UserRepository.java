package com.nykdev.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nykdev.curse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
