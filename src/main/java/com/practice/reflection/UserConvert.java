package com.practice.reflection;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Field;

@Component
public class UserConvert {

    @Autowired
    private StringUser stringUser;

    private ObjectMapper mapper = new ObjectMapper();
    private User user = mapper.readValue(stringUser.getMyInput(), User.class);

    public UserConvert() throws IllegalAccessException, NoSuchFieldException, IOException , NullPointerException {
    }

    private User createUser() throws NoSuchFieldException, IllegalAccessException, IOException {
        Field stringUserField = StringUser.class.getDeclaredField("myInput");
        stringUserField.setAccessible(true);
        String fieldValue = (String) stringUserField.get(stringUser);
        return mapper.readValue(fieldValue, User.class);
    }

   public User getUser() {
       return user;
    }
}
