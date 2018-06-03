package com.practice.reflection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ReflectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ReflectionApplication.class, args);

		UserController controller = (UserController) ctx.getBean("userController");

		System.out.println(controller.printUser());
		System.out.println(ctx.getBean(UserController.class).printUser());
		System.out.println(ctx.getBean(UserDeserializer.class).getUser().getName());
		System.out.println(ctx.getBean(UserDeserializer.class).getUser().getEmail());
		System.out.println(ctx.getBean(UserDeserializer.class).getUser().getId());
	}
}
