package org.cmp.fourall.controllers;

import org.cmp.fourall.models.User;
import org.cmp.fourall.services.UserServices;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userServices.findAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUserByUserId(@PathVariable Integer userId){
        return userServices.findByUserId(userId);
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){
        return userServices.saveAndFlush(user);
    }

    @PutMapping("/users/{userId}")
    public User updateExistUser(@PathVariable Integer userId, @RequestBody User user){
        System.out.println("User "+userId + "User object : " + user.toString());
        User existingUser = userServices.getOne(userId);
        BeanUtils.copyProperties(user, existingUser,"userId");
        return userServices.updateUserById(userId,existingUser);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUserById(@PathVariable Integer userId){
        //Also need to check records before deleting...
        userServices.deleteUserById(userId);
    }
}
