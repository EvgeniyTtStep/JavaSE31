package org.itstep.lesson6.arr;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {

        int[] arr = {21, 56, 37, 95, 41, 57};

//        String arrStr = Arrays.toString(arr);
//        System.out.println(arrStr);
        System.out.println(Arrays.toString(arr));//виводимо масив без циклу
        Arrays.sort(arr);
        System.out.println("sort = " + Arrays.toString(arr));

        int[]newArr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(Arrays.toString(newArr));

    }
}
