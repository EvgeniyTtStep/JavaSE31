package org.itstep.lesson23.list.practice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    //Завдання 1:
    // Користувач вводить з клавіатури набір чисел.
    // Збережіть отримані числа в список.
    // Після чого покажіть меню,
    // в якому запропонуєте користувачеві набір пунктів:
    // 1. Додати елемент до списку.
    // 2. Видалити елемент зі списку.
    // 3. Показати вміст списку.
    // 4. Перевірити, чи є значення у списку.
    // 5. Замінити значення у списку.
    // Дія виконується залежно від вибору користувача,
    // після чого меню з'являється знову.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Заповніть ліст числами");
        List<Integer> integerList = new ArrayList<>();

        while (true) {
            System.out.println("Enter element = ");
            integerList.add(scanner.nextInt());
            System.out.println("Продовжити? y-так n - ні");
            if (scanner.next().equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println(integerList);

        while (true) {
            System.out.println("1 Додати елемент до списку.");
            System.out.println("2 Видалити елемент зі списку.");
            System.out.println("3 Показати вміст списку.");
            System.out.println("4 Перевірити, чи є значення у списку.");
            System.out.println("5 Замінити значення у списку.");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> add(integerList, scanner);
                case 3 -> show(integerList);
                case 4 -> check(integerList, scanner);
            }

        }
    }

    public static void check(List<Integer> integerList, Scanner scanner) {
        if(integerList.contains(scanner.nextInt())){
            System.out.println("Присутній");
        }else {
            System.out.println("НЕ присутній");
        }
    }

    public static void show(List<Integer> integerList) {
        System.out.println(integerList);
    }

    public static void add(List<Integer> list, Scanner scanner) {
        System.out.println("Enter new  element = ");
        list.add(scanner.nextInt());
    }
}
