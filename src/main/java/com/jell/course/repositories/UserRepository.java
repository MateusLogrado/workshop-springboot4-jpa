package com.jell.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jell.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
