package com.abdellah.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abdellah.demo.dto.user.UserCreateRequest;
import com.abdellah.demo.dto.user.UserResponse;
import com.abdellah.demo.model.User;
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

    public UserResponse createUser(UserCreateRequest request) {
        User newUser = new User();
        newUser.setUserName(request.getUserName());
        newUser.setEmail(request.getEmail());
        newUser.setPassword(request.getPassword());
        newUser = userRepository.save(newUser);
        return new UserResponse(newUser.getId(), newUser.getUserName(), newUser.getEmail(), newUser.getCreatedAt(),
                newUser.getUpdatedAt());
    }
}
