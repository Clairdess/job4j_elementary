package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenStart0AndFinish5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;

        assertEquals(expected, Counter.sum(start, finish));
    }

    @Test
    public void whenStart3AndFinish8Then15() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        assertEquals(expected, Counter.sum(start, finish));
    }

    @Test
    public void whenStart1AndFinish1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        assertEquals(expected, Counter.sum(start, finish));
    }

    @Test
    public void whenStart0AndFinish20Then1() {
        int start = 0;
        int finish = 20;
        int expected = 210;
        assertEquals(expected, Counter.sum(start, finish));
    }
}