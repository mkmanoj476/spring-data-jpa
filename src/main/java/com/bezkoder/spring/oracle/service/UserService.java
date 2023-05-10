package com.bezkoder.spring.oracle.service;

import com.bezkoder.spring.oracle.entity.Users;
import com.bezkoder.spring.oracle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getUserdata(){
        return userRepository.findAll();
    }
}
