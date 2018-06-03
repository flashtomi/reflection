package com.practice.reflection;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.lang.reflect.Field;

@Component
public class UserDeserializer {

    @Autowired
    private UserJSONString userJSONString;

    private User user;

    private ObjectMapper mapper = new ObjectMapper();

    @PostConstruct
    public void deserializeJSONString() throws NoSuchFieldException, IllegalAccessException, IOException {
        Field stringUserField = UserJSONString.class.getDeclaredField("myInput");
        stringUserField.setAccessible(true);
        String fieldValue = (String) stringUserField.get(userJSONString);
        user = mapper.readValue(fieldValue, User.class);
    }

    public User getUser() {
        return user;
    }
}
