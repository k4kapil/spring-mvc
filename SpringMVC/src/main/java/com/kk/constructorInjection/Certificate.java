package com.kk.constructorInjection;

public class Certificate {

	private String name;

	public Certificate() {}

	public Certificate(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Certificate [name=%s]", name);
	}
	
}
