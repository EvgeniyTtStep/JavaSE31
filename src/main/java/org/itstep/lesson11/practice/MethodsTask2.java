package org.itstep.lesson11.practice;

import org.itstep.lesson11.methods.ArrFeelRandom;

import java.util.Arrays;

public class MethodsTask2 {

    //Завдання 2: Напишіть метод, який приймає два числа,
    // як параметр, і відображає всі парні числа між ними.

    public static void main(String[] args) {

        int a = 10;
        int b = 50;
        diapazon(a, b);

        int[] randomArr = ArrFeelRandom.feelRandomArr(10, 900, 1000);

        System.out.println("\n" + Arrays.toString(randomArr));


    }

    public static void diapazon(int a, int b) {
        for (int i = a; i < b; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
