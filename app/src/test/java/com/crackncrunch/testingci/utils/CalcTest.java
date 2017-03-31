package com.crackncrunch.testingci.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

}