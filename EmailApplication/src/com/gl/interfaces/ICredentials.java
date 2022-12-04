package com.gl.interfaces;

import com.gl.entity.Employee;

public interface ICredentials 
{
	String generatePassword();
	String generateEmailAddress(String firstName, String lastName, String dept);
	void showCredentials(Employee emp);
}
