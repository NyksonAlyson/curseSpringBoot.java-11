package com.nykdev.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nykdev.curse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
