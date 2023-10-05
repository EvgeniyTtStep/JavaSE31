package org.itstep.lesson6.arr;

import java.util.Random;
import java.util.Scanner;

public class ArrExample {
    public static void main(String[] args) {

//                     0    1   2  3  4
        int[] marks = {12, 10, 11, 7, 9};
        System.out.println(marks[3]);
        marks[3] = 12;
        System.out.println(marks[3]);
        System.out.println("length = " + marks.length);
        System.out.println(marks[marks.length-1]);//значення останнього елементу

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + ")mark = " + marks[i]);
        }



        int[]arrMarks = new int[10];//0 0 0...0
        System.out.println(arrMarks[arrMarks.length-1]);

        Random random = new Random();
        for (int i = 0; i < arrMarks.length; i++) {
            arrMarks[i] = random.nextInt(1, 13);//заповнюємо випадковими значеннями
            System.out.println("arr = " + arrMarks[i]);
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr size");
        int size = sc.nextInt();

        String[] colors = new String[size];

        for (int i = 0; i < colors.length; i++) {
            System.out.println("Enter color = ");
            colors[i] = sc.next();
        }

        for (int i = 0; i < colors.length; i++) {
            System.out.println("color = " + colors[i]);
        }

        double[] nums = new double[]{2.5, 3.7, 1.0};

    }
}
