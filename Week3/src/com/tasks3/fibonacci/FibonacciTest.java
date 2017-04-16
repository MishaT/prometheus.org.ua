package com.tasks3.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testGetNumber1() {
        assertEquals(1, fibonacci.getNumber(1));
    }

    @Test
    public void testGetNumber2() {
        assertEquals(1, fibonacci.getNumber(2));
    }

    @Test
    public void testGetNumber5() {
        assertEquals(5, fibonacci.getNumber(5));
    }

    @Test
    public void testGetNumber11() {
        assertEquals(89, fibonacci.getNumber(11));
    }

    @Test
    public void testGetNumberZero() {
        assertEquals(-1, fibonacci.getNumber(0));
    }

}
