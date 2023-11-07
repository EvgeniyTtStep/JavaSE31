package org.itstep.lesson20.statics.practice;

public class Shape {


    public static int count;

    public static double rombSquare(int d1, int d2) {
        count++;
        return d1 * 0.5 * d2;
    }

    public static int getCount() {
        return count;
    }

}
