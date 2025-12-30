package com.abdellah.demo.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserResponse {
    private UUID id;
    private String userName;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public UserResponse(UUID id, String userName, String email, LocalDateTime createdAT, LocalDateTime updatedAt) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.createdAt = createdAT;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String email() {
        return this.email;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

}
