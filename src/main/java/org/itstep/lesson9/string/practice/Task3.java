package org.itstep.lesson9.string.practice;

import java.util.Scanner;

public class Task3 {
    //Завдання 3
    //Підрахуйте середню довжину слова у введеному реченні з
    //клавіатури.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string with white spaces");
        String str = sc.nextLine();
        int wordsLength = 0;
        String[]strings = str.strip().split("[ ]");

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
