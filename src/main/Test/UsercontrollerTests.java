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
 this.user1 = savedInitialUsers.get(0);
        this.user2 = savedInitialUsers.get(1);

        manyUsers = IntStream.rangeClosed(1, 25)
                .mapToObj(i -> new User("User " + i, "user" + i + "@example.com"))
                .collect(Collectors.toList());
        userRepositry.saveAll(manyUsers);
    }

    @Test
    public void TestGetUserByIdFound() throws Exception {
        mockMvc.perform(get("/api/users/{id}", user1.getId())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id",is(user1.getId().intValue())))
                .andExpect(jsonPath("$.name", is(user1.getName())))
                .andExpect(jsonPath("$.email", is(user1.getEmail())));
    }



}
