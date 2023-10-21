package org.itstep.lesson13.multiarr.practice;

import java.util.Random;

public class MultiArrTask6 {
    //Завдання 6:
    // У двовимірному масиві, заповненому випадковими числами,
    // визначте мінімальний та максимальний елементи для кожного рядка.
    // Результати виведіть на екран.
    public static void main(String[] args) {
        int[][] matr = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < matr.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = random.nextInt(10, 100);
                System.out.print(matr[i][j] + " ");
                if (matr[i][j] > max) {
                    max = matr[i][j];
                }
                if (matr[i][j] < min) {
                    min = matr[i][j];
                }
            }
            System.out.println(" max = " + max + ", min = " + min);
        }
    }
}
