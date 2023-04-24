package com.kk.lifeCycle;

public class Pepsi {

	private double price;

	public Pepsi() {}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of Pepsi");
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Pepsi [price=%s]", price);
	}
	
	public void init()
	{
		System.out.println("Inside init method of Pepsi");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method of Pepsi");
	}
}
