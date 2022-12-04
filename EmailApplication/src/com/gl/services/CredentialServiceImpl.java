package com.gl.services;

import java.util.Random;

import com.gl.entity.Employee;
import com.gl.interfaces.ICredentials;

public class CredentialServiceImpl implements ICredentials {

	@Override
	public String generatePassword() 
	{
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String sml="abcdefghijklmnopqrstuvwxyz";
		String spc="!@#$%^7*()-_+=[]{}|<>.";
		String nums="0123456789";
		StringBuffer rtvalue= new StringBuffer();
		Random rand= new Random();
		int pos=rand.nextInt(caps.length());
		rtvalue.append(caps.charAt(pos));
		pos=rand.nextInt(sml.length());
		rtvalue.append(sml.charAt(pos));
		pos=rand.nextInt(spc.length());
		rtvalue.append(spc.charAt(pos));
		pos=rand.nextInt(nums.length());
		rtvalue.append(nums.charAt(pos));
		for(int i=0; i<4;i++) 
		{
			pos=rand.nextInt(4);
			switch(pos) 
			{
			case 0:
				pos=rand.nextInt(caps.length());
				rtvalue.append(caps.charAt(pos));
				break;
			case 1:
				pos=rand.nextInt(sml.length());
				rtvalue.append(sml.charAt(pos));
				break;
			case 2:
				pos=rand.nextInt(spc.length());
				rtvalue.append(spc.charAt(pos));
				break;
			case 3:
				pos=rand.nextInt(nums.length());
				rtvalue.append(nums.charAt(pos));
				break;
			}
			
		}
		return rtvalue.toString();
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String dept) 
	{
		return firstName.toLowerCase()+lastName.toLowerCase()+"@"+dept.toLowerCase()+"."+"gl.com";
	}

	@Override
	public void showCredentials(Employee emp) 
	{
		System.out.println(emp);
	}

}
