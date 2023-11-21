package org.itstep.lesson26.practice.view;


import org.itstep.lesson26.practice.service.Metods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private int choice;


    public Menu() {
    }

    public Menu(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        if (choice > 0 && choice < 9) {
            this.choice = choice;
        } else {
            System.out.println("Error input");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть операцію");
        while (true) {
            System.out.println("1 Надати початкове введення даних для словника.");
            System.out.println("2 Відобразити слово та його переклади.");
            System.out.println("3 Додати переклад слова.");
            System.out.println("4 Змінити переклад слова.");
            System.out.println("5 Видалити переклад слова.");
            System.out.println("6 Додати слово.");
            System.out.println("7 Змінити слово.");
            System.out.println("8 Видалити слово.");
            System.out.println("9 Відобразити топ-10 найпопулярніших слів.");
            System.out.println("10 Відобразити топ-10 найнепопулярніших слів.");
            System.out.println("0 Вихід.");


            Metods metods = new Metods();


            int choice = scanner.nextInt();
            boolean isSelect = true;
            switch (choice) {
                case 1 ->{
                    metods.addWord("wewather", "погода");
                }
                case 2 ->{ }
                case 3 ->{ }
                case 4 ->{ }
                case 5 ->{ }
                case 6 ->{ }
                case 7 ->{ }
                case 8 ->{ }
                case 9 ->{ }
                case 10 ->{ }
                case 0 -> {
                    System.out.println("До побачення");
                    isSelect = false;;
                }
                default ->  System.out.println("Помилка введення операції. Повторіть спробу. Оберіть цифри зі списку.");

            }
        }
    }

}


