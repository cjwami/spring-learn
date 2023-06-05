package com.cjw.iii.springlearn;

import com.cjw.iii.springlearn.dto.OrderService;
import com.cjw.iii.springlearn.dto.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) throws IllegalAccessException {
		SpringApplication.run(SpringLearnApplication.class, args);
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");

		AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext(UserService.class);

		UserService userService = annotationConfigApplicationContext.getBean(UserService.class);


		for (Field field:userService.getClass().getFields()){
			if(field.isAnnotationPresent(Autowired.class)){
				//给该对象的该属性赋值
				field.set(userService,new OrderService());
			}
		}
	}
}
