package org.itstep.lesson13.multiarr;

import java.util.Arrays;
import java.util.Random;

public class MultiArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        int[][]matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(matrix[0][2]);



        //System.out.println(Arrays.toString(matrix));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        //завнити матрицю випаковими числами


        int[][]matr = new int[5][7];
        Random random = new Random();

        System.out.println(matr.length);//кількість рядків
        System.out.println(matr[0].length);//кількість елементів в рядку


        for (int i = 0; i < matr.length ; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = random.nextInt(10, 100);
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
