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

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{5, 2, 10, 2, 4, 1, 2, 3, 4, 5, 7, 6};
        int el = 99;
        int start = 4;
        int finish = 12;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas99Then2() {
        int[] data = new int[]{5, 2, 99, 2, 4, 44, 55, 66};
        int el = 99;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot23ThenMinus() {
        int[] data = new int[]{5, 2, 10, 2, 4, 1, 2, 3, 4, 5, 7, 6};
        int el = 23;
        int start = 1;
        int finish = 12;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}