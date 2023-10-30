package org.itstep.lesson16.inherit;

public class Triangle extends Shape {

    private int side;

    public Triangle(int width, int height) {
        super(width, height);
    }

    // ========== super() ===============
    public Triangle(int width, int height, int side) {
        super(width, height);
        this.side = side;
    }

    // ============= this() ===========
//    public Triangle(int width, int height,int side) {
//        this(width, height);
//        this.side = side;
//    }



    @Override
    public int perimeter() {
        return super.getWidth() + super.getHeight() + side;
    }

    @Override
    public int square() {
        return (int) Math.round(0.5 * getHeight() * side);
    }

    public static int squarePr(int side) {
        return side * 2;
    }


}
