package org.example.lesson4;

public class Circle implements Shapes {
    private double radius;
    private String backgroundColor;
    private String borderColor;

    public Circle(double radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getName() {
        return "Круг";
    }
}
