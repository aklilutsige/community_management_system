package org.cmp.fourall.services;

import org.cmp.fourall.models.User;

import java.util.List;

public interface UserServices {
    List<User> findAllUsers();
    User findByUserId(Integer id);
    User getOne(Integer id);
    User saveAndFlush(User user);
    User updateUserById(Integer id, User user);
    void deleteUserById(Integer id);



}
