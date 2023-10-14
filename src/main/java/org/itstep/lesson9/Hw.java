package org.itstep.lesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
       // Заповніть масив розмірності n випадковими цифрами від 0 до
//        33. Знайдіть елемент масиву, який ділиться без остачі на
//        значення елемента зліва і значення елемента справа. Виведіть в
//        консоль значення початкового масиву. Виведіть індекс
//        знайденого елемента. Якщо такий не знайдено,виведіть -1. n —
//        задається з клавіатури
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність масиву: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(34);
        }
        System.out.println(Arrays.toString(array));


        int foundIndex = -1;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] % array[i - 1] == 0 && array[i] % array[i + 1] == 0) {
                foundIndex =  i;
                break;
            }
        }


        if (foundIndex != -1) {
            System.out.println("Індекс знайденого елемента: " + foundIndex);
        } else {
            System.out.println("Такого елемнету немає");
        }
    }



}
