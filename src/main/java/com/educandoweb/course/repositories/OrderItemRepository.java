package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

// aqui poderia ser colocado o @Repository para indicar que é um repositório, 
// porém essa classe já esta implementando o 'JpaRepository', logo não precisa
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	// não é necessário fazer a implementação nessa interface, pois o Spring JPA já possue como Default

}
