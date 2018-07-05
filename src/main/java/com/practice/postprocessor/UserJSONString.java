package com.practice.postprocessor;

import org.springframework.stereotype.Component;

@Component
public class UserJSONString {

    private String myInput = "{\"id\" : \"123456\", \"name\" : \"John\", \"email\" : \"john.test@test.com\"}";

    public String getMyInput() {
        return myInput;
    }
}
