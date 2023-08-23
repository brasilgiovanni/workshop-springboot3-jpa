package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	// não é necessário fazer a implementação nessa interface, pois o Spring JPA já possue como Default

}
