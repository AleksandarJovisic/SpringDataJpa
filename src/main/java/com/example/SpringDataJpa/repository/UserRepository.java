package com.example.SpringDataJpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDataJpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findByUsername(String username);

}
