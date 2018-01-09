package com.company.Gabriel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ericjohn1 on 10/25/2016.
 */
public class GabrielTest {
    private FizBuz fb;
    @Before
    public void setUp(){
        fb = new FizBuz();
    }

    @Test
    public void oneReturnsOne(){
        assertEquals("1",fb.eval(1));
    }

    @Test
    public void twoReturnsTwo(){
        assertEquals("2", fb.eval(2));
    }
    @Test
    public void threeReturnsFizz(){
        assertEquals("Fizz", fb.eval(3));
    }
    @Test
    public void fiveReturnsBuzz(){
        assertEquals("Buzz", fb.eval(5));
    }
    @Test
    public void sixReturnsFizz(){
        assertEquals("Fizz", fb.eval(6));
    }
    @Test
    public void tenReturnsBUzz(){
        assertEquals("Buzz", fb.eval(10));
    }
    @Test
    public void fifteenReturnsFizzBUzz(){
        assertEquals("FizzBuzz", fb.eval(15));
    }
}
