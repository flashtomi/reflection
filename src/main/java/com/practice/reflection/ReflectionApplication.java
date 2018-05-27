package com.practice.reflection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ReflectionApplication {

	public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, IOException, NullPointerException {
		SpringApplication.run(ReflectionApplication.class, args);

//		String myInput = "{\"id\" : \"123456\", \"name\" : \"John\", \"email\" : \"john.test@test.com\"}";
//		ObjectMapper mapper = new ObjectMapper();
//		User user = mapper.readValue(myInput, User.class);

		UserConvert userConvert = new UserConvert();
		System.out.println(userConvert.getUser());
	}
}
