package org.example.classes;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public double getArea() {
        return width*length;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width,2)+Math.pow(length,2));
    }

    public double getPerimeter() {
        return ((width*2)+(length*2));
    }
}
