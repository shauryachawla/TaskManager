package com.kasa.task_manager.repositories;

import com.kasa.task_manager.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(final String username);
}
