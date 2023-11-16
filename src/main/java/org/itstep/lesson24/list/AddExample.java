package org.itstep.lesson24.list;

import java.util.Arrays;
import java.util.Random;

public class AddExample {

    static int[] arr = new int[1];
    static int full = 0;


    public static void add(int item) {
        if (full + 1 == arr.length) {
            int[] temp = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            //arr = Arrays.copyOf(arr, arr.length + 1); // теж саме
        }
        arr[full] = item;
        full++;
    }


    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i < 10; i++) {
            add(random.nextInt(10, 100));
        }

        System.out.println(Arrays.toString(arr));
    }
}
