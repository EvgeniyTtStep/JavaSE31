package org.itstep.lesson5.practice;

import java.util.Scanner;

public class Task5 {

    //Завдання 5:
    // Користувач вводить з клавіатури число.
    // Розрахуйте факторіал числа.
    // Наприклад, якщо введено 3, факторіал числа 1*2*3 = 6.
    // Формула для розрахунку факторіалу: n! = 1*2*3…*n, де "n" — число для розрахунку факторіалу.

    // 1*2*3*4*5 = 120  factorial !5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num! = ");
        int f = sc.nextInt();
        int end = f;

//        for (int i = 1; i <= end; i++){
//            f *= i;
//        }


        int i = 1;
        while (i < end) {
            f *= i;
            i++;
        }
        System.out.println(f);
    }
}
