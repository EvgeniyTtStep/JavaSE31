package org.itstep.lesson16.inherit;

public class ColorTriangle extends Triangle {


    public static String BASE_COLOR = "blue";

    static {
        BASE_COLOR = "yellow";
    }

    short r = 1;
    short g = 3;
    short b = 5;

    //блочная инициализация
    {
        r = 255;
        g = 50;
        b = 100;
    }

    public ColorTriangle(int width, int height) {
        super(width, height);
    }


//    public ColorTriangle() {
//        this.r = 10;
//        this.g = 30;
//        this.b = 255;
//    }
}
