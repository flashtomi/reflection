package com.practice.postprocessor;

import com.google.gson.Gson;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class UserBeanFactory implements BeanFactoryPostProcessor {

    @Autowired
    private UserJSONString userJSONString;

    private User user;

    private Gson gson = new Gson();

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println(configurableListableBeanFactory.getBeanNamesIterator());

        user = gson.fromJson(userJSONString.getMyInput(), User.class);
    }

    public User getUser() {
        return user;
    }
}
