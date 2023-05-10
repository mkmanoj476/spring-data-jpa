package com.bezkoder.spring.oracle.controller;

import com.bezkoder.spring.oracle.entity.Users;
import com.bezkoder.spring.oracle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("user")
    public List<Users> getusers(){
        return userservice.getUserdata();
    }
}
