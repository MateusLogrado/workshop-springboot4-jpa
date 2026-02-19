package com.jell.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jell.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
