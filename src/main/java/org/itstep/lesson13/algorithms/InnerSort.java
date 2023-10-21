package org.itstep.lesson13.algorithms;

import java.util.Arrays;
import java.util.Random;

public class InnerSort {
    public static void main(String[] args) {
        //int[] array = {21, 85, 11, 44, 51, 36, 99, 81};

        int[]array = new int[10_000];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 10000);
        }

        int temp, j;

        long start = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }


        long stop = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        System.out.println(stop - start);
    }
}
