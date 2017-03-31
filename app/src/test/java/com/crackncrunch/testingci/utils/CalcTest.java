package com.crackncrunch.testingci.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    private Calc mCalc;

    @Before
    public void setUp() throws Exception {
        mCalc = new Calc();
    }

    @Test
    public void add() throws Exception {
        assertEquals(5, mCalc.add(3, 2));
    }

    @Test
    public void deduct() throws Exception {
        assertEquals(7, mCalc.deduct(10, 3));
    }
}