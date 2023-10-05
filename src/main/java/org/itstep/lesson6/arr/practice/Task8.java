package org.itstep.lesson6.arr.practice;

import java.util.Random;

public class Task8 {
    //Завдання 8:
    // В одновимірному масиві,
    // заповненому випадковими числами,
    // визначте мінімальний та максимальний елементи,
    // підрахуйте кількість від'ємних та додатних елементів,
    // підрахуйте кількість нулів.
    // Результати виведіть на екран.

    public static void main(String[] args) {

        int[] nums = new int[10];

        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(-100, 101);//заповнюємо випадковими значеннями
            //System.out.println("arr = " + nums[i]);
        }

        int max = nums[0]; //Integer.MIN_VALUE;
        int min = nums[0]; //Integer.MAX_VALUE;
        int pos = 0;
        int neg = 0;
        int zer = 0;

        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i] + " ");

            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }

            if (nums[i] > 0) {
                pos++;
            }
            if (nums[i] < 0) {
                neg++;
            }
            if (nums[i] == 0) {
                zer++;
            }
        }

        System.out.println("\nmax = " + max);
        System.out.println("min = " + min);
        System.out.println("pos = " + pos);
        System.out.println("neg = " + neg);
        System.out.println("zer = " + zer);

    }
}
