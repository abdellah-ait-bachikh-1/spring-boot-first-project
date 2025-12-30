package com.abdellah.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abdellah.demo.model.User;
import com.abdellah.demo.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
