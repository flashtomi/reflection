package com.practice.reflection;

import org.springframework.stereotype.Component;

@Component
public class StringUser {

    private String myInput = "{\"id\" : \"123456\", \"name\" : \"John\", \"email\" : \"john.test@test.com\"}";

    public String getMyInput() {
        return myInput;
    }
}
