package com.nykdev.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nykdev.curse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
