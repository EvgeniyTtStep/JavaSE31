package org.itstep.lesson7;

import java.util.Arrays;
import java.util.Random;

public class ArraysHWTask5 {
    //Завдання 5
    //Заповніть масив з 10 елементів випадковими числами від -10 до
    //+10. Підрахуйте кількість повторюваних значень. Виведіть в
    //консоль тільки повторювані елементи і кількість повторень.
    //Приклад:
    //0 – 5 разів
    //2 – 3 рази
    //7 – 1 разів

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 11);
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " find " + count + " times");
            count = 0;
        }
        System.out.println(Arrays.toString(arr));


        String srr = "123";
        String str1 = "123456";
        System.out.println(str1.contains(srr));
    }



}
