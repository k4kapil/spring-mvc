package com.kk.constructorInjection;

public class Ambiguity {

	private int a;
	private int b;
	
	public Ambiguity(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor is int, int");
	}
	
	public Ambiguity(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor is double, double");
	}
	
	public Ambiguity(String a, String b) {
		super();
		this.a =  Integer.parseInt(a);
		this.b =  Integer.parseInt(b);
		System.out.println("Constructor is string, string");
	}
	
	public void sum()
	{
		System.out.println("Value of a is "+ this.a);
		System.out.println("Value of b is "+ this.b);
		System.out.println("Sum is "+ (this.a+this.b));
	}
}
