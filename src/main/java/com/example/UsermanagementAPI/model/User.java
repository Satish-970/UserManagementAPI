package com.example.UsermanagementAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name = "users") // This annotation specifies the name of the table in the database
@Entity
@Data // This annotation indicates that this class is a JPA entity
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

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private java.time.LocalDateTime createdAt;

    public User(String name, String email) {
        this.name=name;
        this.email=email;

    }


    @Getter
    @Setter
    @CreationTimestamp

    @Column(name = "updated_at")
    private java.time.LocalDateTime updatedAt;

  public  User() {
        // Default constructor is required by JPA
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
