package com.app.barbar.repositories;

import com.app.barbar.entities.Wine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WineRepository extends JpaRepository<Wine, Long> {
    List<Wine> findByNameContaining(String name);
}
