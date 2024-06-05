package com.projectsweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsweb.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}

