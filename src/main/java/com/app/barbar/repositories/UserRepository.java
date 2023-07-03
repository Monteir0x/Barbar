package com.app.barbar.repositories;

import com.app.barbar.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContaining(String name);

    Optional<Object> findByUsername(String username);
}
