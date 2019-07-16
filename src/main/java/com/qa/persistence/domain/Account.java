package com.qa.persistence.domain;

public class Account {
	// String name;
	// This class needs to have:
	// An id
	// An Account Number
	// A First Name
	// A last Name

	private String firstName;
	private String lastName;
	private int id;
	private int accountNumber;

	public Account(String firstName, String lastName, int id, int accountNumber) {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}
