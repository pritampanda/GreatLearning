package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;

	public String getFirstname() {
		return firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public Employee(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;

	}

}
