package org.itstep.lesson3.practice;

public class Task2IF {

//Завдання 2:
// Користувач вводить з клавіатури три числа.
// Залежно від вибору користувача,
// програма виводить  на екран суму трьох чисел
// або добуток трьох чисел.


    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 51;

        System.out.println("sum  = 1");
        System.out.println("mult  = 2");

        int choice = 2;

        if (choice == 1) {
            System.out.println(a + b + c);
        } else if (choice == 2) {
            System.out.println(a * b * c);
        } else {
            System.out.println("Error");
        }

        System.out.println("==============");

        switch (choice) {
            case 1 -> System.out.println(a + b + c);
            case 2 -> System.out.println(a * b * c);
            default -> System.out.println("Error");
        }


    }
}
