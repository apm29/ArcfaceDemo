package com.arcsoft.arcfacedemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
        int x = 8;
        int y = 100;
        y = x ^ y;
        x = x ^ y;
        y = x ^ y;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}