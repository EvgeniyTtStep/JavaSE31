package org.itstep.lesson6.arr.practice;

import java.util.Scanner;

public class Task6 {

    //Завдання 6:
    // Користувач вводить з клавіатури елементи одновимірного масиву.
    // Обчисліть суму елементів масиву та їх середнє арифметичне.
    // Виведіть на екран всі елементи масиву.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr size");
        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number = ");
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];// +=
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum/nums.length);

    }
}
