package com.kk.reference;

public class A {

	private int a;
	private B obj;
	
	public A() {}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		return String.format("A [a=%s]", a);
	}
	
	
}
