package com.kk.autowiring;

public class Employee {

	private Address address;

	public Employee() {}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Employee [address=%s]", address);
	}
}
