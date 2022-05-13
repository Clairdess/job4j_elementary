package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double answer = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return answer;
    }

    public static void main(String[] args) {
        double result = Point.distance(8, 0, 16, 7);
        System.out.println("result (8, 0) to (16, 7) " + result);
    }
}