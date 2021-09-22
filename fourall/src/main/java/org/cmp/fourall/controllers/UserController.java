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
        return userServices.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserByID(@PathVariable Integer id){
        return userServices.findById(id);
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){
        return userServices.saveAndFlush(user);
    }

    @PutMapping("/users/{id}")
    public User updateExistUser(@PathVariable Integer id, @RequestBody User user){
        System.out.println("User "+id + "User object : " + user.toString());
        User existingUser = userServices.getOne(id);
        BeanUtils.copyProperties(user, existingUser,"id");
        return userServices.updateUserById(id,existingUser);
    }

    @DeleteMapping("/users/{id}")
    public void deleteExistUser(@PathVariable Integer id){
        //Also need to check records before deleting...
        userServices.deleteUserById(id);
    }
}
