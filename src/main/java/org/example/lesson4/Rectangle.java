package org.example.lesson4;

public class Rectangle implements Shapes {

    private double width;
    private double height;
    private String backgroundColor;
    private String borderColor;

    public Rectangle(double width, double height, String backgroundColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getName(){
        return "Прямоугольник";
    }
}
