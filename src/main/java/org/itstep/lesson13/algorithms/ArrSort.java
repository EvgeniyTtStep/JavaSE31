package org.itstep.lesson13.algorithms;

import java.util.Arrays;
import java.util.Random;

public class ArrSort {
    public static void main(String[] args) {
        int[] array = new int[10_000];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 10000);
        }

        long start = System.currentTimeMillis();
        Arrays.sort(array);
        long stop = System.currentTimeMillis();


        System.out.println(Arrays.toString(array));
        System.out.println(stop - start);
    }
}
