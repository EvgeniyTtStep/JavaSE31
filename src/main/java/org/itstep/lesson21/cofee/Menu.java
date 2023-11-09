package org.itstep.lesson21.cofee;

import java.util.Scanner;

public class Menu {


    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int machineChoice = scanner.nextInt();

        //обрати кавомашину
        switch (machineChoice) {

        }

        //обрати операцію
        System.out.println("Оберіть операцію");
        System.out.println("1 - еспрессо");
        System.out.println("2 - зробити амерікано");
        int choice = scanner.nextInt();

    }


}
