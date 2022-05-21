package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To6Then6() {
        int left = 5;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when2And3And4And1Then4() {
        int first = 2;
        int second = 3;
        int third = 4;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when15And33And55Then55() {
        int first = 15;
        int second = 44;
        int third = 55;
        int result = Max.max(first, second, third);
        int expected = 55;
        Assert.assertEquals(result, expected);
    }

}