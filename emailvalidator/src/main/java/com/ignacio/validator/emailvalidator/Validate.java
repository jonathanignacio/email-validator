package com.ignacio.validator.emailvalidator;

/**
* Simple application for Software Engineering Assignment 3.
* Provides logic for validating an email address.
*
* @author  Jonathan Ignacio
*/
public class Validate {
	
	/**
	* 
	* Method for testing if an email address is valid.
	* @param email - A string to be tested as a valid email address.
	* @author  Jonathan Ignacio
	*/
	public static boolean ValidateEmail(String email){
		char[] emailTest = email.toCharArray();
		int atNum = 0, dotNum = 0;
		for(int i=0; i < emailTest.length; i++){
			if(emailTest[i] == '@')
				atNum++;
			else if(emailTest[i] == '.'){
				dotNum++;
			}
		}
		if(atNum == 1 && dotNum > 0){
			return true;
		}
		else
			return false;
	}
}
