package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testGreet() {
        Hello hello = new Hello();
        String result = hello.greet("World");
        assertEquals("Hello, World! Welcome to Jenkins CI/CD Pipeline.", result);
    }

    @Test
    public void testAdd() {
        Hello hello = new Hello();
        assertEquals(5, hello.add(2, 3));
        assertEquals(0, hello.add(-1, 1));
        assertEquals(-3, hello.add(-1, -2));
    }
}