package org.example;

public class Calculations {

    public int getFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double getAreaOfTheTriangle(double baseLength, double height) {
        return 0.5 * baseLength * height;
    }

    public double add(double a, double b) {
        return Math.round((a + b) * 100.0) / 100.0;
    }

    public double subtract(double a, double b) {
        return Math.round((a - b) * 100.0) / 100.0;
    }

    public double multiplication(double a, double b) {
        return Math.round((a * b) * 100.0) / 100.0;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль не допускается");
        }
        return Math.round((a / b) * 100.0) / 100.0;
    }

    public boolean numberIsLess(double a, double b) {
        return a < b;
    }

    public boolean numberIsGreat(double a, double b) {
        return a > b;
    }

    public boolean numberIsEqual(double a, double b) {
        return a == b;
    }
}
