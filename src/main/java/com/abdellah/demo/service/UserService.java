package com.abdellah.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abdellah.demo.dto.UserResponse;
import com.abdellah.demo.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponse> getAllUsers() {
        return this.userRepository.findAll().stream().map(user -> new UserResponse(user.getId(), user.getUserName(),
                user.getEmail(), user.getCreatedAt(), user.getUpdatedAt())).toList();
    }

}
