package ru.job4j.loop;

import org.junit.Assert;
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

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToTwentyThen110() {
        int start = 2;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 110;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToSeventyThen1258() {
        int start = 3;
        int finish = 70;
        int result = Counter.sumByEven(start, finish);
        int expected = 1258;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToThousandThen250500() {
        int start = 0;
        int finish = 1000;
        int result = Counter.sumByEven(start, finish);
        int expected = 250500;
        Assert.assertEquals(expected, result);
    }

}