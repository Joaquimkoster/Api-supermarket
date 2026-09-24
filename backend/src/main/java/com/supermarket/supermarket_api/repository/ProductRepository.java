package com.supermarket.supermarket_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supermarket.supermarket_api.model.Product;


@Repository 
public interface ProductRepository extends JpaRepository<Product, Long> {

}