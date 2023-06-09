package com.kk.autowiring;

public class Address {

	private String street;
	private String city;
	private int pinCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return String.format("Address [street=%s, city=%s, pinCode=%s]", street, city, pinCode);
	}	
}
