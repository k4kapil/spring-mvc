package com.kk.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean, DisposableBean{

	private double price;

	public Samosa() {}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of Samosa");
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Samosa [price=%s]", price);
	}

	public void afterPropertiesSet() throws Exception {
		// this is init method
		System.out.println("In init method of Samosa");
		
	}

	public void destroy() throws Exception {
		// this is destroy method
		System.out.println("In destroy method of Samosa");
	}	
}
