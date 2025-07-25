package com.example.springjwt.repository;

import com.example.springjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByUsername(String username);

    User findByUsername(String username);
}
