package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CounterTest {

    @Test
    public void testReset() {

        Counter c = new Counter();

        c.increment();
        c.reset();

        assertEquals(0, c.getCount());
    }

    @Test
    public void testIncrement() {

        Counter c = new Counter();

        c.increment();

        assertEquals(1, c.getCount());
    }

    @Test
    public void testDecrement() {

        Counter c = new Counter();

        c.decrement();

        assertEquals(-1, c.getCount());
    }
}