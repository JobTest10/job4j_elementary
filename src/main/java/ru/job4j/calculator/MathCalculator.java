package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMul(double first, double second) {
        return sum(first, second)
                + mul(first, second);
    }

    public static double divAndDif(double first, double second) {
        return div(first, second)
                + dif(first, second);
    }

    public static double all(double first, double second) {
        return sum(first, second)
                + sum(first, second)
                + mul(first, second)
                + dif(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMul(10, 20));
        System.out.println("Результат расчета равен: " + divAndDif(10, 20));
        System.out.println("Результат расчета равен: " + all(10, 20));
    }
}