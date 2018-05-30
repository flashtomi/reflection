package com.practice.reflection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class UserController {

    @Autowired
    UserDeserializer userDeserializer;

    @RequestMapping("/")
    public User getUser() throws IllegalAccessException, NoSuchFieldException, IOException {
        return userDeserializer.deserializeJSONString();
    }
}
