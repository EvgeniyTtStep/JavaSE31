package org.itstep.lesson2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ім'я");
        String name = scanner.nextLine();
        System.out.println("Name = " + name);

        System.out.println("Напишіть якесь число = ");
        int num;
        num = scanner.nextInt();
        System.out.println("num = " + num);

        System.out.println("Напишіть якесь дробове число = ");
        double num1 = scanner.nextDouble();
        System.out.println("num1 = " + num1);

        System.out.println("Напишіть слово через пробіл = ");
        String str = scanner.next();
        System.out.println(str);
        System.out.println(scanner.next());

    }
}
