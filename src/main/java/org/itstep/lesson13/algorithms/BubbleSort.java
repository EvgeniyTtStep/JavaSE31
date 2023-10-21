package org.itstep.lesson13.algorithms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        //int[] arr = {12, 45, 78, 96, 32, 81, 27};

        int[]arr = new int[10_000];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 10000);
        }




       long start =  System.currentTimeMillis();

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);
        System.out.println(Arrays.toString(arr));
    }
}
