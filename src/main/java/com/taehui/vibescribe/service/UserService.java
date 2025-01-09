package com.taehui.vibescribe.service;

import com.taehui.vibescribe.entity.User;
import com.taehui.vibescribe.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserJpaRepository userJpaRepository;

    @Autowired
    public UserService(UserJpaRepository userJpaRepository){
        this.userJpaRepository = userJpaRepository;
    }

    public User createUser(User user){
        return userJpaRepository.save(user);
    }
    public List<User> getUserList(){
        return userJpaRepository.findAll();
    }
}
