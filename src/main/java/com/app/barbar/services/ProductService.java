package com.app.barbar.services;

import com.app.barbar.entities.Product;
import com.app.barbar.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product getProductByName(String name);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}

