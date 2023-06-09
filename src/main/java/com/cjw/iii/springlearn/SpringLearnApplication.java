package com.cjw.iii.springlearn;

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

		AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext(Appendable.class);


	}
}
