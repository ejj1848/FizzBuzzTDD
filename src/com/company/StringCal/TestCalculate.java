package com.company.StringCal;

import com.company.StringCal.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ericjohn1 on 10/24/2016.
 */

public class TestCalculate {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }
    @Test
    public void emptyStringReturnsZero() throws Exception {

        assertEquals(calculator.calculate(""),0);

    }
    @Test
    public void singleValueIsReturned() throws Exception {

        assertEquals(calculator.calculate("1"),1);
    }

    @Test
    public void twoNumberscommaDelimitedReutrnSum() throws Exception {
        assertEquals(calculator.calculate("1,2"),3);
    }
    @Test
    public void twoNumbersNewLineDelimitedREturnSum() throws Exception {
        assertEquals(calculator.calculate("1\n2"), 3);
    }

    @Test
    public void threeNumbersReturnSum() throws Exception {
        assertEquals(calculator.calculate("1,2,3"),6);
    }
    @Test(expected = Exception.class)
    public void negativeInputException() throws Exception {
        calculator.calculate("-1");
    }

    @Test
    public void ingoreGreaterThanThousand()throws Exception{
        assertEquals(calculator.calculate("1,1,10000"),2);
    }

}
