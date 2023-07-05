package com.app.barbar.repositories;

import com.app.barbar.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
