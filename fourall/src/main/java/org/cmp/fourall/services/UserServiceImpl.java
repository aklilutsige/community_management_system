package org.cmp.fourall.services;

import lombok.SneakyThrows;
import org.cmp.fourall.exception.NotFoundException;
import org.cmp.fourall.models.User;
import org.cmp.fourall.repositaries.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        System.out.println("Handling request mapping [ GET ] ALL users ");
        return userRepository.findAll();
    }

    @Override
    @SneakyThrows
    public User findById(Integer id) {
        System.out.println("Handling request mapping [ GET ] user by id ");
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found"));
    }

    @Override
    public User getOne(Integer id){
        return userRepository.getOne(id);
    }

    @Override
    public User saveAndFlush(User user) {
        System.out.println("Handling request mapping [ POST ] add new user ");
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User updateUserById(Integer id, User user) {
        System.out.println("Handling request mapping [ PUT ] update user by id ");
        User existingUser = userRepository.findById(id).get();
        System.out.println(existingUser);
        existingUser.setUserName(user.getUserName());
        existingUser.setUserPassword(user.getUserPassword());
        return userRepository.save(existingUser);
    }
    @Override
    public void deleteUserById(Integer id) {
        System.out.println("Handling request mapping [ DELETE ] user by id ");
        userRepository.deleteById(id);
    }

}
