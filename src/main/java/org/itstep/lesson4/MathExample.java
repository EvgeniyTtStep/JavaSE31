package org.itstep.lesson4;

import java.math.BigDecimal;
import java.util.Random;

public class MathExample {
    public static void main(String[] args) {

        double powRes = Math.pow(3, 3);
        System.out.println("powRes = " + powRes);

        int max = Math.max(10, 5);
        System.out.println("max = " + max);

        //знайти максимум з 4х чисел
        int a, b, c, d;
        a = 10;
        b = 12;
        c = 6;
        d = 9;
        int maxFour = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("maxFour = " + maxFour);

        //int round = (int)15.999956;
        System.out.println("Math.round(12.49999) = " + Math.round(12.5));
        System.out.println("ceil = " + Math.ceil(12.001));
        System.out.println("floor = " + Math.floor(12.9999));

        System.out.println(Math.random());
        System.out.println("30 - 50 " + (Math.round(Math.random()* (50 - 30)) + 30));

        Random random = new Random();
        int r = random.nextInt(50, 60);
        System.out.println("50 - 60 = " + r);

    }
}
