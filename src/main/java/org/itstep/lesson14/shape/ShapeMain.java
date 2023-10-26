package org.itstep.lesson14.shape;

public class ShapeMain {
    public static void main(String[] args) {

        Shape shape = new Shape(10, 20);
        System.out.println(shape.getX());
        System.out.println(shape.getY());


        Shape rectengle = new Shape();
        rectengle.setX(15);
        rectengle.setY(27);


        Shape square = new Shape();
        square.setX(5);
        square.setY(5);


    }
}
