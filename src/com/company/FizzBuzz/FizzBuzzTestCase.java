package com.company.FizzBuzz;

import com.company.FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ericjohn1 on 10/12/2016.
 */
public class FizzBuzzTestCase {
    private FizzBuzz fb;

    @Before
    public void setUp() throws Exception{
        fb = new FizzBuzz();
    }

    @Test
    public void canEvaluate(){
        fb.eval(1);
    }

    @Test
    public void oneReturnsOne (){
        assertEquals("1", fb.eval(1));

    }
    @Test
    public void twoReturnsTwo(){
        assertEquals("2", fb.eval(2));
    }

    @Test
    public void threeReturnsFizz(){
        assertEquals("Fizz", fb.eval(3));

    }
    // we assume that 4 will work, but it wouldnt be a bad idea to test it

    @Test
    public void fiveReturnsBuzz(){
        assertEquals("Buzz" , fb.eval(5));
    }

    @Test
    public void sixReturnsSix(){
        assertEquals("Fizz", fb.eval(6));
    }
    @Test
    public void tenReturnsBuzz(){
        assertEquals("Buzz",fb.eval(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz(){
        assertEquals("FizzBuzz", fb.eval(15));
    }

    @Test
    public void thirtyReturnsFizzBuzz(){
        assertEquals("FizzBuzz", fb.eval(30));
    }
}
