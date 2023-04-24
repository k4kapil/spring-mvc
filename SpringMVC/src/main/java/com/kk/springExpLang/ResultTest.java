package com.kk.springExpLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResultTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/kk/springExpLang/expLangConfig.xml");
		Result result= context.getBean("result",Result.class);
		System.out.println(result);
	}

}
