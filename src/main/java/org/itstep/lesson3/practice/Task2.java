package org.itstep.lesson3.practice;

public class Task2 {
    //Завдання 2
    //У змінній n зберігається натуральне (ціле) тризначне число.
    //Створіть програму, яка обчислює і виводить на екран суму цифр
    //числа n
    public static void main(String[] args) {
        int n = 461;

        int a = n/100; // 4
        int b = n % 10; // 1
        int c = n / 10 % 10; // 6

        System.out.println("sum = " + (a + c + b));
    }
}
