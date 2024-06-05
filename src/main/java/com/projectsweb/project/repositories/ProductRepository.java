package com.projectsweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsweb.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
