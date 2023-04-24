package com.kk.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PepsiTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=  new ClassPathXmlApplicationContext("com/kk/lifeCycle/lifeCycleConfig.xml");
        Pepsi pepsi1= (Pepsi) context.getBean("pepsi1");
        Samosa samosa1= (Samosa) context.getBean("samosa1");
        PepsiWithAnnotation pepsi2= (PepsiWithAnnotation) context.getBean("pepsi2");
        System.out.println("----------------");
        System.out.println(pepsi1);
        // shutdown hook
        context.registerShutdownHook();
        System.out.println("----------------");
        System.out.println(samosa1);
        System.out.println("----------------");
        System.out.println(pepsi2);
      
	}

}
