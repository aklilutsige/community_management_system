package org.cmp.fourall.controllers;

import lombok.extern.slf4j.Slf4j;
import org.cmp.fourall.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AddUserController {
    @PostMapping("/addNewUser")
    public ResponseEntity addNewUser(@RequestBody User user) {
        System.out.println("Handling addNewUser request");
        return ResponseEntity.ok().build();
    }

}
