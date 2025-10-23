package org.example;

public class Triangle implements Shapes {

    private double baseLength;
    private double secondSide;
    private double thirdSide;
    private double height;
    private String backgroundColor;
    private String borderColor;

    public Triangle(double baseLength, double secondSide, double thirdSide, double height, String backgroundColor, String borderColor) {
        this.baseLength = baseLength;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return baseLength + secondSide + thirdSide;
    }

    public double getArea() {
        return 0.5 * baseLength * height;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getName(){
        return "Треугольник";
    }

}