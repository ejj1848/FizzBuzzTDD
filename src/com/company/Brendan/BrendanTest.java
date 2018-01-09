package com.company.Brendan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by ericjohn1 on 10/25/2016.
 */
public class BrendanTest {

    private Equation eq;
    @Before
    public void setUp(){
        eq = new Equation();
    }

    @Test
    public void oneReturnsEmptyString(){
        assertEquals("",eq.createEquation(1));
    }

    @Test
    public void testForThree(){
       assertEquals(eq.createEquation(3),"3=3");
    }

    @Test
    public void testForFive(){
        assertEquals("3+5=8", eq.createEquation(5));
    }

    @Test
    public void testForFifteen(){
        assertEquals("3+5+6+9+10+12+15=60", eq.createEquation(15));
    }

}
