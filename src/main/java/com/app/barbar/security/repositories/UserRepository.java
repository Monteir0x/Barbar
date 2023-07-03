package com.app.barbar.security.repositories;

import com.app.barbar.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String name);
    Boolean existsByUsername(String name);
    Boolean existsByEmail(String email);
}
