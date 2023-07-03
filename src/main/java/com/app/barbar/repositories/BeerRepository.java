package com.app.barbar.repositories;

import com.app.barbar.entities.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeerRepository extends JpaRepository<Beer, Long> {
    List<Beer> findByNameContaining(String name);
}
