package com.gl.entity;

public class Employee 
{
	private String firstName;
	private String lastName;
	private String eMail;
	private String pwd;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Dear " + firstName + " " + lastName+ " your generated credentials are as follows " +"\neMail ---->" + eMail + "\nPassword---->" 
	+ pwd;
	}
	
}
