package org.example;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();

    default double defaultPerimeter() {
        return 0;
    }
}

