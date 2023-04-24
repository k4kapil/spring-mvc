package com.kk.fullyAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.kk.fullyAnnotations")
public class AnnotationConfig {
	
	// or we can use @Bean annotation
	
	@Bean
	public Student atBeanObject()
	{
		Student student= new Student();
		return student;
	}
}
