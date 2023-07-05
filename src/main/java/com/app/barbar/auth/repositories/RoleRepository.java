package com.app.barbar.auth.repositories;

import com.app.barbar.auth.models.ERole;
import com.app.barbar.auth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
