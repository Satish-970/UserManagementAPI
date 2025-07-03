package com.example.UsermanagementAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name = "users") // This annotation specifies the name of the table in the database
@Entity // This annotation indicates that this class is a JPA entity
public class User {
    @Id // This annotation specifies that this field is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is mandatory")
    @Size(min=2, max=100, message = "Name must be between 2 and 100 characters")
    private  String name;
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;
    @Column(name = "Created At" , updatable = false)
    @CreationTimestamp
    private java.time.LocalDateTime createdAt;

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // This field will automatically be populated with the current timestamp when the entity is created
    // The 'updatable = false' attribute indicates that this field should not be updated after
    @Column(name = "Updated At")
    @CreationTimestamp
    private java.time.LocalDateTime updatedAt;

  public  User() {
        // Default constructor is required by JPA
  }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
