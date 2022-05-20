package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean dataExpected = data[0];
        for (boolean datum : data) {
            if (dataExpected != datum) {
                result = false;
                break;
            }
        }
        return result;
    }
}