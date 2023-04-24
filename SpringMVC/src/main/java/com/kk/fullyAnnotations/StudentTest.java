package com.kk.fullyAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
	
		// By using @Component annotation	
		ApplicationContext context= new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Student student= context.getBean("student",Student.class);
		Student student1= context.getBean("atBeanObject",Student.class);
		System.out.println(student);
		student1.sum(12,34.7);
	
	
	}

}
