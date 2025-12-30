package com.abdellah.demo.model;

import java.time.LocalTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "user_name")
    private String userName;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(name = "created_at")
    private LocalTime createdAt;
    @Column(name = "updated_at")
    private LocalTime updatedAt;

    public User() {

    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalTime.now();
        this.updatedAt = LocalTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalTime.now();
    }

    public UUID getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public LocalTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalTime getUpdatedAt() {

        return this.updatedAt;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
