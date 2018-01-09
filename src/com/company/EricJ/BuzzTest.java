package com.company.EricJ;

import com.company.FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Eric.Johnson on 6/19/2017.
 */
public class BuzzTest {

    private FizzBuzz fb;


    @Before
    public void createClass(){
    fb = new FizzBuzz();
    }

    @Test
    public void canEvaluate(){
        fb.eval(1);
    }

    @Test
    public void oneReturnsOne(){
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

    @Test
    public void fiveReturnsBuzz(){
        assertEquals("Buzz", fb.eval(5));
    }
    @Test
    public void sixReturnsFizz(){
        assertEquals("Fizz",fb.eval(6));
    }
    @Test
    public void tenReturnsBuzz(){
        assertEquals("Buzz", fb.eval(10));
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
