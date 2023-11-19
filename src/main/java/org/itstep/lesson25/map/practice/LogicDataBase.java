package org.itstep.lesson25.map.practice;

import java.util.Scanner;

public class LogicDataBase {

    public void logicDB() {
        Menu menu = new Menu();


        MethodsDB methods = new MethodsDB();
        while (true) {
            menu.menu();
            switch (menu.getChoice()) {
                case 1 -> methods.printDataBase();
                case 2 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter user code");
                    int code = scanner.nextInt();
                    methods.printByINN(code);
                }
                case 3 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter user code");
                    String typeFine = scanner.nextLine();
                    methods.printUsersByFineType(typeFine);
                }
            }
        }
    }

}
