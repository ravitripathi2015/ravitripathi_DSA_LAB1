package com.gl.main;

import java.util.Scanner;

import com.gl.entity.Employee;
import com.gl.interfaces.ICredentials;
import com.gl.services.CredentialServiceImpl;

public class EmailApp {

	public static void main(String[] args) 
	{
		Employee emp = new Employee("Ravi","Tripathi");
		ICredentials cred= new CredentialServiceImpl();
		Scanner scan =new Scanner(System.in);
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("Please enter the department from the following ");
		int dept=scan.nextInt();
		switch(dept) 
		{
		case 1:
			emp.seteMail(cred.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"Technical"));
			emp.setPwd(cred.generatePassword());
			cred.showCredentials(emp);
			break;
		case 2:
			emp.seteMail(cred.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"Admin"));
			emp.setPwd(cred.generatePassword());
			cred.showCredentials(emp);
			break;
		case 3:
			emp.seteMail(cred.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"Human Resource"));
			emp.setPwd(cred.generatePassword());
			cred.showCredentials(emp);
			break;
		case 4:
			emp.seteMail(cred.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"Legal"));
			emp.setPwd(cred.generatePassword());
			cred.showCredentials(emp);
			break;
		default:
			System.out.println("Invalid Department Email and Password can't be generated");
			break;
		}

		scan.close();
	}

}
