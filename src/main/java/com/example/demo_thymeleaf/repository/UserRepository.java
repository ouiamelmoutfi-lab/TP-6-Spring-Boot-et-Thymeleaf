package com.example.demo_thymeleaf.repository;


import com.example.demo_thymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
// Fournit les méthodes CRUD
    List<User> findByNameContainingIgnoreCase(String name);

    User findByEmail(String email);
}