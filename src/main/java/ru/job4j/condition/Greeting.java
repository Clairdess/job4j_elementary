package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
    }

    public static boolean checkNumber(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }
}

