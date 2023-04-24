package com.kk.reference;

public class B {

	private int b;

	public B() {}

	public B(int b) {
		super();
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return String.format("B [b=%s]", b);
	}	
}
