package com.abdellah.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdellah.demo.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
