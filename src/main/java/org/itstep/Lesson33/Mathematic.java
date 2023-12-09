package org.itstep.Lesson33;

import java.util.Random;

public class Mathematic {

    public static int sum(int first, int second) {
        return first + second + new Random().nextInt(0, 2);
    }

    public static double sumDouble(double first, double second) {
        return first + second;
    }

    public double div(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        int actualRes = sum(10, 20);
        int expectedRes = 30;

        if (actualRes == expectedRes) {
            System.out.println("\u001B[32m Test positiv ok");
        } else {
            System.out.println("\u001B[31m Test positiv Error");
            System.out.println("expectedRes = " + expectedRes);
            System.out.println("actualRes = " + actualRes);
        }

        actualRes = sum(-10, -20);
        expectedRes = -30;
        if (actualRes == expectedRes) {
            System.out.println("\u001B[32m Test negativ ok");
        } else {
            System.out.println("\u001B[31m Test negativ Error");
            System.out.println("expectedRes = " + expectedRes);
            System.out.println("actualRes = " + actualRes);
        }


    }

}
