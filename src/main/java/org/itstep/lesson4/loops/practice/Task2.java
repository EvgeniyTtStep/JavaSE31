package org.itstep.lesson4.loops.practice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        for (int i = first; i < second; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

////          13
//        if (first % 2 != 0) {
//            first += 1; // 14
//        }
//
//        for (int i = first; i < second; i += 2) {
//            System.out.println("i = " + i);
//        }
    }
}
