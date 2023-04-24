package com.kk.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	private List<String> phoneNo;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties prop;
	
	public Employee() {	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	
	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Employee(String empName, List<String> phoneNo, Set<String> address, Map<String, String> courses,
			Properties prop) {
		super();
		this.empName = empName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.courses = courses;
		this.prop = prop;
	}

	@Override
	public String toString() {
		return String.format("Employee [empName=%s, phoneNo=%s, address=%s, courses=%s, prop=%s]", empName, phoneNo,
				address, courses, prop);
	}
}
