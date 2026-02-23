package com.jell.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jell.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
