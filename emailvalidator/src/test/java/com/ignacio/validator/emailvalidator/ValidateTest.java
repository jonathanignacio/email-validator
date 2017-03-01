package com.ignacio.validator.emailvalidator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Validate.
 */
public class ValidateTest 
    extends TestCase
{
	
	String[] domains = {"hotmail.com", "mail.com", "gmail.com"};
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ValidateTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ValidateTest.class );
    }

    /**
     * Verify that {@link validate} correctly displays the number of passing tests
     */
    public void testValidate(){
    	assertEquals(0, Validate.validate("completefailure"));
    	assertEquals(1, Validate.validate("partial@failure"));
    	assertEquals(1, Validate.validate("partial.failure"));
    	assertEquals(2, Validate.validate("initial@success.io"));
    }
    
    /**
     * Verify that the check for '@' characters functions correctly
     */
    public void testValidateAt(){
    	assertTrue(Validate.validateAt("this@"));
    	assertFalse(Validate.validateAt("fail"));
    }
    
    
    /**
     * Verify that the check for '.' characters functions correctly.
     */
    public void testValidateDot(){
    	assertTrue(Validate.validateDot("...pass"));
    	assertTrue(Validate.validateDot(".pass"));
    	assertFalse(Validate.validateDot("fail"));
    }
    
    /**
     * Verify that the check for valid domains functions correctly
     */
    public void testValidateEmailDomain(){
    	assertTrue(Validate.validateEmailDomain("test@gmail.com", domains)); //gmail.com is a valid domain
    	assertFalse(Validate.validateEmailDomain("nodomaingiven", domains));
    }
}
