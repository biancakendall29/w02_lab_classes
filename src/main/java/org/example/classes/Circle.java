package org.example.classes;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return Math.PI*radius*radius;
        //return 2*Math.PI*radius;
    }
}
