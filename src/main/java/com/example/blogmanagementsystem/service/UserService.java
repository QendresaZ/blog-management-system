package com.example.blogmanagementsystem.service;

import com.example.blogmanagementsystem.domain.User;
import com.example.blogmanagementsystem.repository.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class UserService {

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }
}
