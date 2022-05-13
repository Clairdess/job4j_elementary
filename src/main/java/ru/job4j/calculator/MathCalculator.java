package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDivision(double first, double second) {
        return minus(125, 120) + division(5, 5);
    }

    public static double sumAll(double first, double second) {
        return minus(3, 1) + sum(1, 2) + division(20, 5) + multiply(5, 5);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}