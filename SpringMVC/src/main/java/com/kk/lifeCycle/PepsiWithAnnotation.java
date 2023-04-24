package com.kk.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PepsiWithAnnotation {

	private double price;

	public PepsiWithAnnotation() {}

	public PepsiWithAnnotation(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting value of pepsi with Annotaion");
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("PepsiWithAnnotation [price=%s]", price);
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Inside init method of Pepsi with Annotaion");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Inside destroy method of Pepsi with Annotaion");
	}
}
