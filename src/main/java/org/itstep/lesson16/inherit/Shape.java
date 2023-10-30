package org.itstep.lesson16.inherit;

public class Shape {
    private int width;
    private int height;


    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public int perimeter() {
        return (width + width) * 2;
    }

    public int square() {
        return width * height;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
