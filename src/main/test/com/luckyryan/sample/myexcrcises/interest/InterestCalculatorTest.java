package com.luckyryan.sample.myexcrcises.interest;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.security.InvalidParameterException;
import java.util.Date;

/**
 * @author m.abareghi
 *         4/12/14 - 10:55 AM
 */
@RunWith(MockitoJUnitRunner.class)
public class InterestCalculatorTest extends TestCase {
    InterestCalculator calculator = null;

    @Before
    public void setUp() throws Exception {
        calculator = new InterestCalculatorImpl();

    }

    @After
    public void tearDown() throws Exception {

    }

    public void testCalculateNullInput() {
        try {
            calculator.calculate(null, null);
            fail("passing null as both parameter must throw NullPointerException");
            calculator.calculate(null, new Date());
            fail("passing null as first must throw NullPointerException");
            calculator.calculate(new Date(), null);
            fail("passing null as second must throw NullPointerException");
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }


    @Test
    public void testCalculateFromAfterTwoVerifyThrowsInvalidParamException() {
        long currentTime = System.currentTimeMillis();
        Date from = new Date(currentTime);
        Date to = new Date(currentTime - (24 * 60 * 60 * 1000));
        try {
            calculator.calculate(from, to);
            fail("When \'to\' is before \'from\', method must throw InvalidParameterException");
        } catch (InvalidParameterException e) {
            assertTrue(true);
        }
    }

//    @Test
//    public void testCalculateFromEqualsTwoVerifyPass(){
//        long currentTime = System.currentTimeMillis();
//        Date from = new Date(currentTime);
//        Date to = new Date(currentTime);
//        try {
//            calculator.calculate(from, to);
//            assertTrue(true);
//        } catch (InvalidParameterException e) {
//            fail("When \'to\' equals \'from\', method must not throw InvalidParameterException");
//        }
//    }
//
//    @Test
//    public void testCalculateFromBeforeTwoVerifyPass(){
//        long currentTime = System.currentTimeMillis();
//        Date from = new Date(currentTime-1);
//        Date to = new Date(currentTime);
//        try {
//            calculator.calculate(from, to);
//            assertTrue(true);
//        } catch (InvalidParameterException e) {
//            fail("When \'to\' after \'from\', method must not throw InvalidParameterException");
//        }
//    }


    @Test
    public void testCalculateNumberOfDays() {
        InterestCalculatorImpl testCalculator = new InterestCalculatorImpl();
//        testCalculator.getNumberOfBusinessDays()
    }


    public void testMultipleChangeInGit() {


        // this is to test multiple file change in git
    }
}
