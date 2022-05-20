package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {727, 222, 222, 445, 123, 10222};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot127ThenMinus1() {
        int[] data = {15, 423, 34124, 1232};
        int el = 127;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas34124Then2() {
        int[] data = {1, 1, 34124, 1};
        int el = 34124;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}