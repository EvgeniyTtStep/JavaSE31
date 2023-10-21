package org.itstep.lesson13.algorithms;

import java.util.Arrays;
import java.util.Random;

public class SelectSort {
    public static void main(String[] args) {
        //int[] array = {21, 85, 11, 44, 51, 36, 99, 81};

        int[]array = new int[10_000];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 10000);
        }


        long start = System.currentTimeMillis();

        for (int min = 0; min < array.length - 1; min++) {
            int least = min;

            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }



        long stop = System.currentTimeMillis();



        System.out.println(Arrays.toString(array));
        System.out.println(stop - start);
    }
}
