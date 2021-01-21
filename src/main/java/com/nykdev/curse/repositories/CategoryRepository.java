package com.nykdev.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nykdev.curse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
