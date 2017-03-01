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
     * Verify email test, passes with given constraints.
     */
    public void testValidateEmail()
    {
        assertTrue(Validate.ValidateEmail("test@mail.com")); //test for @ and .
        assertFalse(Validate.ValidateEmail("failthis")); //test for failing case
        assertFalse(Validate.ValidateEmail("@@mail.com")); //test for more than 2 @'s
        assertFalse(Validate.ValidateEmail("nodot@")); //test for no dot
    }
}
