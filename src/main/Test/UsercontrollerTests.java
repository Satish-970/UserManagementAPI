package com.example.UsermanagementAPI;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.example.UsermanagementAPI.model.User;
import com.example.UsermanagementAPI.repositry.UserRepositry;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class UsercontrollerTests {
    @Autowired
    private MockMvc mockmvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private UserRepositry userRepositry;

        private User user1;
        private User user2;

        @BeforeEach
    void setUp() {
        userRepositry.deleteAll();
        objectMapper.registerModule(new JavaTimeModule());
        User initialUser1 = new User("John Doe", "Johndeo@gmail.com");
        User initialUser2 = new User("Jane Smith", "Jane@gmail.com");
        List<User> savedInitialUsers = userRepositry.saveAll(List.of(initialUser1, initialUser2));


}
