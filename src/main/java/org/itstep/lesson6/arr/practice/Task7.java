package org.itstep.lesson6.arr.practice;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr size");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number = ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Введіть число для пошуку");
        int x =sc.nextInt();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x){
                count++;
            }
        }
        System.out.println("Число " + x + "зустрічається в масиві " + count);
    }
}
