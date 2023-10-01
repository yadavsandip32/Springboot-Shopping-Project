package com.shopping.shopservice.repository;

import com.shopping.shopservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}