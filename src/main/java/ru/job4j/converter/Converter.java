package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float temp = 420;
        float test1 = Converter.rubleToEuro(temp);
        float test2 = Converter.rubleToDollar(temp);
        System.out.println(temp + "rubles are " + test1 + " euro.");
        System.out.println(temp + "rubles are " + test2 + " dollar.");
    }
}