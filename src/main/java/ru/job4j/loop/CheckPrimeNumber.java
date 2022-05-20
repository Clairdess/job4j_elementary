package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                continue;
            }
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
