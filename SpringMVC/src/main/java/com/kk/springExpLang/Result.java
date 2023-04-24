package com.kk.springExpLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Result {

	@Value("#{50+101}")
	private int x;
	
	@Value("#{90+10}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")	 // calling static method
	private int z;								 // T(class).methodName(value)
	
	@Value("#{T(java.lang.Math).PI}")       // calling static/final variable
	private int a;							// T(class).variableName
	
	@Value("#{T(java.lang.Math).E}")
	private double b;
	
	@Value("#{new java.lang.String('Kapil Kr')}")  // creating object
	private String name;						  // new Object(value)
	
	@Value("#{5>3}")
	private boolean value;
	
	public Result() {}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Result [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", b=" + b + ", name=" + name + ", value="
				+ value + "]";
	}

	
}
