package ru.job4j.array;

public class PrintEvenElements {
    public static String printEvenInts(int[] numbers) {
        String ln = System.lineSeparator();
        String res = "Элементы массива с чётными индексами, начиная с последнего: " + ln;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - i - 1) % 2 == 0) {
                res += numbers[numbers.length - i - 1] + ln;
            }
        }
        return res;
    }
}