package org.itstep.lesson11.methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrFeelRandom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        int[] randomArr = feelRandomArr(size, a, b);

        System.out.println(Arrays.toString(randomArr));
    }

    public static int[] feelRandomArr(int size, int a, int b) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = random.nextInt(a, b);
        }

        return arr;
    }
}
