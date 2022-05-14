package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {
    @Test
    public void firstDay() {
        String day = "Понедельник";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void secondDay() {
        String day = "Вторник";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void thirdDay() {
        String day = "Среда";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void fourthDay() {
        String day = "Четверг";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void fifthDay() {
        String day = "Пятница";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void sixthDay() {
        String day = "Суббота";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void seventhDay() {
        String day = "Восскресенье";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void firstDayEng() {
        String day = "Monday";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void secondDayEng() {
        String day = "Tuesday";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void thirdDayEng() {
        String day = "Wednesday";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void fourthDayEng() {
        String day = "Thursday";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void fifthDayEng() {
        String day = "Friday";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void sixthDayEng() {
        String day = "Saturday";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void seventhDayEng() {
        String day = "Sunday";
        int answer = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, answer);
    }

}