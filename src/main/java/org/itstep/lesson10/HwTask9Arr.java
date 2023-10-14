package org.itstep.lesson10;

import java.util.Random;

public class HwTask9Arr {
    // В одновимірному масиві, заповненому випадковими числами,
    //обчисліть:
    // Суму від'ємних чисел.
    // Суму парних чисел.
    // Суму непарних чисел.
    // Добуток елементів з індексами, кратними 3.
    // Добуток елементів між мінімальним та максимальним елементом.
    // Суму елементів, що знаходяться між першим та останнім додатним елементом
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 10);
            System.out.print(arr[i] + " ");
        }

        int negativeSum = 0;      // для від'ємних чисел
        int evenSum = 0;          // для парних чисел
        int oddSum = 0;           // для непарних чисел
        int elementproduct = 1;   // для добутка елементів з індексами, кратними 3

        int max = arr[0];         // для елементів між мінімальним та максимальним елементом
        int min = arr[0];

        int firstlastSum = 0;     // для суми елементів, що знаходяться між першим та останнім додатним елементом
        int first = -1;
        int last = -1;


        int indexMax = 0;
        int indexMin = 0;
        int maxMinMult = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeSum = negativeSum + arr[i]; //Сума від'ємних чисел
            }
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i]; // Сумa парних чисел
            }
            if (arr[i] % 2 != 0) {
                oddSum = oddSum + arr[i]; // Сумa непарних чисел
            }
            if (i % 3 == 0 && i != 0) {
                elementproduct *= arr[i]; // Добуток елементів з індексами, кратними 3
            }
            if (max < arr[i]) {
                max = arr[i];
                indexMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                indexMin = i;
            }
            if (arr[i] > 0) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }

            if (first != -1 && last != -1 && first != last) {
                for (int j = first + 1; j < last; j++) {
                    firstlastSum = firstlastSum + arr[i];
                }
            }
        }

        if (indexMin < indexMax) {
            for (int j = indexMin; j < indexMax; j++) {
                maxMinMult *= arr[j];
            }
        } else if (indexMin > indexMax) {
            for (int j = indexMax; j < indexMin; j++) {
                maxMinMult *= arr[j];
            }
        }


        System.out.println(" ");
        System.out.println("Сума від'ємних чисел = " + negativeSum);
        System.out.println("Сумa парних чисел = " + evenSum);
        System.out.println("Сумa непарних чисел = " + oddSum);
        System.out.println("Добуток елементів з індексами, кратними 3 = " + elementproduct);
        System.out.println("Добуток елементів між мінімальним та максимальним елементом = " + min * max);
        System.out.println("Суму елементів, що знаходяться між першим та останнім додатним елементом = " + firstlastSum);
        System.out.println("maxMinMult = " + maxMinMult);

    }
}
