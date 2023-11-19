package org.itstep.lesson25.map.practice;

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
        System.out.println("1. Повний друк бази даних.");
        System.out.println("2. Друк даних за вказаним кодом.");
        System.out.println("3*. Друк даних за певним типом штрафу.");
        System.out.println("4. Друк даних за вказаним містом.");
        System.out.println("5. Додавання нової людини з інформацією про неї.");
        System.out.println("6*. Додавання нових штрафів для вже існуючого запису.");
        System.out.println("7*. Видалення штрафу.");
        System.out.println("8. Заміна інформації про людину та її штрафи.");
        setChoice(scanner.nextInt());
    }

}
