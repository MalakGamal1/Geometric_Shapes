package com.mycompany.geometric_project;
public class Circle {
    private double radius;
    double PI =Math.PI;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*PI;
    }
    public double getPerimeter() {
        return 2*PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
