package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        printColor();
        checkSumSign();
        compareNumbers();
        System.out.println(amountLimits(9, 12));
        checkingTheNumbers(8);
        System.out.println(checkingPositiveAndNegativeNumbers(-12));
        printALine("вафля", 8);
        System.out.println(leapYear(4000));
        replaceTheNumbers();
        fillInAnEmptyArray();
        multiplyingNumbersInAnArray();
        fillInASquareArray();
        createAnArray(4, 12);

        Bowl bowl = new Bowl(50);
        Cat[] cats = {new Cat("Васька "), new Cat("Барсик "), new Cat("Мурка "), new Cat("Рыжик ")};
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        Shapes circle = new Circle(5," белый ", " синий ");
        Shapes rectangle = new Rectangle (5.2, 3.9, " черный ", " красный ");
        Shapes triangle = new Triangle (9.8, 5, 6, 7, " зеленый ", " желтый ");
        circle.printCharacteristics();
        rectangle.printCharacteristics();
        triangle.printCharacteristics();

        var productsArray = Product.InitializeProducts();
        for (Product product : productsArray) {
            product.printInfo();
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 8;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 150;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean amountLimits(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void checkingTheNumbers(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkingPositiveAndNegativeNumbers(int a) {

        return (a < 0);
    }

    public static void printALine(String a, int b) {

        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean leapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void replaceTheNumbers() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void fillInAnEmptyArray() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void multiplyingNumbersInAnArray() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void fillInASquareArray() {
        int[][] a = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a.length - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(a));
    }

    public static void createAnArray(int len, int initialValue) {
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = initialValue;
        }
        System.out.println(Arrays.toString(a));
    }
}






