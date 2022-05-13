package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        //double temp1 = x2 - x1;
        //double temp2 = y2 - y1;
        //double powTemp1 = Math.pow(temp1, 2);
        //double powTemp2 = Math.pow(temp2, 2);
        //double sumPow = powTemp1 + powTemp2;
        //double sqrtSumPow = Math.sqrt(sumPow);
        double answer = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return answer;
    }

    public static void main(String[] args) {
        double result = Point.distance(8, 0, 16, 7);
        System.out.println("result (8, 0) to (16, 7) " + result);
    }
}