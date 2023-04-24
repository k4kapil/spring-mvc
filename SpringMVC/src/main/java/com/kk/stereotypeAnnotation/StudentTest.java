package com.kk.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
	
	ApplicationContext context=  new ClassPathXmlApplicationContext("com/kk/stereotypeAnnotation/stereotypeConfig.xml");
	Student student= context.getBean("student",Student.class);
	Student student1= context.getBean("student",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
	
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
}
}
