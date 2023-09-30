package org.itstep.lesson4.loops.practice;

import java.util.Scanner;

public class Task1 {
    //Завдання 1:
    // Користувач вводить з клавіатури два числа.
    // Вкажіть усі числа у заданому діапазоні.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        int first = sc.nextInt();
        System.out.println("enter second num");
        int second = sc.nextInt();

        for (int i = first; i <= second; i++) {
            System.out.println(" i = " + i);
        }
    }
}
