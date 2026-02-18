package com.jell.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jell.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
