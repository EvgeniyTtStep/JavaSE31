package org.itstep.lesson19.practice;

public class GenericTask4 {
    //Завдання 4:
    // Реалізуйте шаблонний метод
    // для пошуку максимуму в масиві.


    public static void main(String[] args) {

        // з масивами автоупакування ПЕ ПРАЦЮЄ!!!!!
        //        int[]arr = {5,2,7,9,5,3,10};
        //        findMaxArr(arr); не можна передати!!!

        Double[] arr1 = {5.1, 2.1, 2.4, 3.1, 5.6, 3.7};
        System.out.println("Max = " + findMaxArr(arr1));


        //цей спосіб кращще бо не має обмежень по Comparable
        Number[] arr2 = {5.1, 2.1, 2.4, 3.1, 5.6, 3.7};
        System.out.println("Maximum = " + findMaximum(arr2));


    }


    public static <T extends Number> T findMaximum(T[] arr) {
        T max = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() > max.doubleValue()) {
                max = arr[i];
            }
        }
        return max;
    }

    public static <T extends Number & Comparable<T>> T findMaxArr(T[] arr) {
        T max = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

}
