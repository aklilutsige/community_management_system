package org.cmp.fourall.controllers;

import org.cmp.fourall.services.UserServices;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
class UserControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    UserServices applicationService;


    @Test
    void getAllUsers() {

    }

    @Test
    void getUserByID() {
    }

    @Test
    void addNewUser() {
    }

    @Test
    void updateExistUser() {
    }

    @Test
    void deleteExistUser() {
    }
}