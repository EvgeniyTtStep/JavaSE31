package org.itstep.lesson5.innerloop.practice;

public class Task2 {
//Завдання 2:
// Користувач вводить з клавіатури розмір сторони квадрата.
// Виведіть на екран незаповнений квадрат (відображаються лише межі квадрата).
// Розмір сторони дорівнює введеному розміру.
    public static void main(String[] args) {
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");    // ********
                                          // *      *
                                          // ********
            }
            System.out.println();
        }
    }
}
