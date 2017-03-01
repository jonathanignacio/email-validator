package com.ignacio.validator.emailvalidator;

/**
* Simple application for Software Engineering Assignment 3.
* Provides logic for validating an email address.
*
* @author  Jonathan Ignacio
*/
public class Validate {
	
	String[] domains = {"hotmail.com", "mail.com", "gmail.com"};
	/**
	* 
	* Method for testing if an email address is valid. 
	* @param email - an email to test validity.
	* @return number of passing rules.
	* @author  Jonathan Ignacio
	*/
	public static int validate(String email){
		int rules = 0;
		if(validateAt(email))
			rules++;
		if(validateDot(email))
			rules++;
		return rules;
		
	}
	
	/**
	 * Validates that an email only has a single '@' character.
	 * 
	 * @param email - an email to check.
	 * @return True if there is a single '@' character.
	 */
	public static boolean validateAt(String email){
		char[] emailTest = email.toCharArray();
		int atNum = 0;
		for(int i=0; i < emailTest.length; i++){
			if(emailTest[i] == '@')
				atNum++;
			}
		if(atNum == 1)
			return true;
		else
			return false;
	}
	
	/**
	 * Validates that an email only has a single '@' character.
	 * 
	 * @param email - an email to check.
	 * @return True if the email contains one or more '.' characters.
	 */
	public static boolean validateDot(String email){
		if(email.contains("."))	
			return true;
		else
			return false;
	}
	
	/**
	 * Validates that an email only has a single '@' character.
	 * 
	 * @param email - an email to check.
	 * @param domains - list of valid domain.
	 * @return True if the email's domain is contained within the list of valid domains.
	 */
	public static boolean validateEmailDomain(String email, String[] domains){
		return false; //initial failure
	}
}
