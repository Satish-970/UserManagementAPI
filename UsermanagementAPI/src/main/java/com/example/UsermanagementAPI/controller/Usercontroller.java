package com.example.UsermanagementAPI.controller;

import com.example.UsermanagementAPI.model.User;
import com.example.UsermanagementAPI.repositry.UserRepositry;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class Usercontroller {
   @Autowired // This annotation is used to inject the UserRepositry bean
    private UserRepositry userRepositry;
   @PostMapping
   public ResponseEntity<List<User>> createUser(@Valid @RequestBody List<User> user) {
        // This method will handle POST requests to create a new user
        User savedUser = userRepositry.save(user);
        List<User> savedUser = userRepositry.saveAll(user);
        // Save the user to the database and return the saved user in the response
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
    @GetMapping
    public List<User> getAllUsers() {
        // This method will handle GET requests to retrieve all users
        return userRepositry.findAll();
    }
    @GetMapping("/{id}")
    // This method will handle GET requests to retrieve a user by ID
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user=userRepositry.findById(id);
    return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @Valid @RequestBody User userDetails){
    // This method will handle PUT requests to update an existing user
        return  userRepositry.findById(id).map(existingUser -> {
            existingUser.setName(userDetails.getName());
            existingUser.setEmail(userDetails.getEmail());
            User updatedUser = userRepositry.save(existingUser);
            return ResponseEntity.ok(updatedUser);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
    // This method will handle DELETE requests to delete a user by ID
        if(userRepositry.existsById(id)) {
            userRepositry.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }




}
