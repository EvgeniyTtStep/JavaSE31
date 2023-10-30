package org.itstep.lesson16.inherit;

public class Rectangle extends Shape{

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public int perimeter() {
        return super.perimeter();
    }

    @Override
    public int square() {
        return super.square();
    }
}
