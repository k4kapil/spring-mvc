package com.kk.constructorInjection;

public class Person {

	private String name;
	private int id;
	private Certificate certi;
	
	public Person(String name, int id,Certificate certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi= certi;
	}

	public Person() {}

	@Override
	public String toString() {
		return String.format("Person [name=%s, id=%s, certi=%s]", name, id, certi);
	}

	
	
}
