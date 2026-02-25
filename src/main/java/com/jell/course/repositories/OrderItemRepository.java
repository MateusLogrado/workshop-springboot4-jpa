package com.jell.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jell.course.entities.OrderItem;
import com.jell.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
	
}
