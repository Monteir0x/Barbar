package com.app.barbar.controllers;

import com.app.barbar.entities.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductController {
    ResponseEntity<List<Product>> getAllProducts();
    ResponseEntity<Product> getProductById(Long id);
    ResponseEntity<Product> createProduct(Product product);
    ResponseEntity<Product> updateProduct(Long id, Product product);
    ResponseEntity<Void> deleteProduct(Long id);
    ResponseEntity<Product> getProductByName(String name);
}

