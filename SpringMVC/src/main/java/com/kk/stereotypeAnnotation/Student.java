package com.kk.stereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	@Value("Kapil")
	private String name;
	
	@Value("B.Tech")
	private String course;
	
	@Value("#{list}")
	private List<String> address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("Student [name=%s, course=%s, address=%s]", name, course, address);
	}
	
	
	
}
