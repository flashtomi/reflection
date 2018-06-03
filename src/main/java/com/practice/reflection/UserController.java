package com.practice.reflection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserDeserializer userDeserializer;

    public UserController(UserDeserializer userDeserializer) {
        this.userDeserializer = userDeserializer;
    }

    @RequestMapping("/")
    public User getUser() {
        return userDeserializer.getUser();
    }

    public User printUser() {
        return userDeserializer.getUser();
    }
}
