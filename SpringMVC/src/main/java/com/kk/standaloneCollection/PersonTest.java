package com.kk.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	public static void main(String[] args) {
		
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/kk/standaloneCollection/standaloneCollectionConfig.xml");
		
		Person person1= context.getBean("person1",Person.class);
		Person person2= context.getBean("person2",Person.class);
		Person person3= context.getBean("person3",Person.class);
		Person person4= context.getBean("person4",Person.class);
		Person person5= context.getBean("person5",Person.class);
		Person person6= context.getBean("person6",Person.class);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
		System.out.println(person6);
		
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person2.getFriends().getClass().getName());
		System.out.println(person3.getFriends().getClass().getName());
		System.out.println(person4.getFriends().getClass().getName());
		System.out.println(person4.getFeeStructure().getClass().getName());
		System.out.println(person5.getFeeStructure().getClass().getName());
		System.out.println(person6.getProperties().getClass().getName());
		System.out.println(person6.getProperties());
	}
}
