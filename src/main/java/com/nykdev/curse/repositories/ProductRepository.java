package com.nykdev.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nykdev.curse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
