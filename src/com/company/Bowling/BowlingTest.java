package com.company.Bowling;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ericjohn1 on 10/25/2016.
 */
public class BowlingTest {

    @Test
    public void knockingOnePin(){
        int score = 0;
        score += 1;
        assertEquals(1,score);
    }
    @Test
    public void knockingTwoPin(){
        int score = 0;
        score += 2;
        assertEquals(2,score);
    }
}
