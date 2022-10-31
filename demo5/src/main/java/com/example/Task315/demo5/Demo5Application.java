package com.example.Task315.demo5;

import com.example.Task315.demo5.config.Config;
import com.example.Task315.demo5.model.User;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Communication communication = context.getBean("communication", Communication.class);

		List<User> allUsers = communication.getUsers();
		System.out.println(allUsers);

		User user = new User(3,"James", "Brown", 24);
		User update = new User(3, "Thomas", "Shelby",24);

		communication.save(user);

		communication.updateUser(update);

		communication.deleteUser(3);




	}

}
