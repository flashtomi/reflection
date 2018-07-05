package com.practice.postprocessor;

import com.google.gson.Gson;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInitBean implements InitializingBean {

    @Autowired
    private UserJSONString userJSONString;

    private User user;
    private Gson gson = new Gson();

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitSequenceBean: afterPropertiesSet");
        user = gson.fromJson(userJSONString.getMyInput(), User.class);
    }

    public User getUser() {
        return user;
    }
}
