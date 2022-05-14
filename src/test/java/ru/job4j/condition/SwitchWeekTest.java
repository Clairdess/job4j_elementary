package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void firstDay() {
        int numberOfDay = 1;
        String day = SwitchWeek.nameOfDay(numberOfDay);
        String expected = "Понедельник";
        Assert.assertEquals(expected, day);
    }

    @Test
    public void secondDay() {
        int numberOfDay = 2;
        String day = SwitchWeek.nameOfDay(numberOfDay);
        String expected = "Вторник";
        Assert.assertEquals(expected, day);
    }

    @Test
    public void thirdDay() {
        int numberOfDay = 3;
        String day = SwitchWeek.nameOfDay(numberOfDay);
        String expected = "Среда";
        Assert.assertEquals(expected, day);
    }

    @Test
    public void fourthDay() {
        int numberOfDay = 4;
        String day = SwitchWeek.nameOfDay(numberOfDay);
        String expected = "Четверг";
        Assert.assertEquals(expected, day);
    }

    @Test
    public void fifthDay() {
        int numberOfDay = 5;
        String day = SwitchWeek.nameOfDay(numberOfDay);
        String expected = "Пятница";
        Assert.assertEquals(expected, day);
    }

    @Test
    public void sixthDay() {
        int numberOfDay = 6;
        String day = SwitchWeek.nameOfDay(numberOfDay);
        String expected = "Суббота";
        Assert.assertEquals(expected, day);
    }

    @Test
    public void seventhDay() {
        int numberOfDay = 7;
        String day = SwitchWeek.nameOfDay(numberOfDay);
        String expected = "Восскресенье";
        Assert.assertEquals(expected, day);
    }

    @Test
    public void undefinedDay() {
        int numberOfDay = 123;
        String day = SwitchWeek.nameOfDay(numberOfDay);
        String expected = "Ошибка";
        Assert.assertEquals(expected, day);
    }

}