package com.kk;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.collection.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Kapil!" );
        ApplicationContext context=  new ClassPathXmlApplicationContext("config.xml");
        Student student1= (Student) context.getBean("student1");
        Student student2= (Student) context.getBean("student2");
        Student student3= (Student) context.getBean("student3");
        
        Employee employee1= (Employee) context.getBean("employee1");
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(employee1);
        System.out.println(employee1.getEmpName());
        System.out.println(employee1.getPhoneNo());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getCourses());
        System.out.println(employee1.getProp());
    }
}
