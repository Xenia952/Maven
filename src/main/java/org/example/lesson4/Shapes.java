package org.example.lesson4;

public interface Shapes {

    double getPerimeter();

    double getArea();

    String getBackgroundColor();

    String getBorderColor();

    String getName();

    default void printCharacteristics() {
        System.out.println("Фигура: " + getName());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет фона: " + getBackgroundColor());
        System.out.println("Цвет границ: " + getBorderColor());
        System.out.println();
    }
}
