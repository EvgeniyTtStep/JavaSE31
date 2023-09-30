package org.itstep.lesson3.switchex;

import java.util.Scanner;

public class AppSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("натисніть 1");
        System.out.println("натисніть 2");
        System.out.println("натисніть 3");
        System.out.println("натисніть 4");
        System.out.println("натисніть 5");
        System.out.println("натисніть будьяку кнопку для виходу");

       int choice = sc.nextInt();

        // old version
//        switch (choice) {
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            case 4:
//                System.out.println("four");
//                break;
//            case 5:
//                System.out.println("five");
//                break;
//            default:
//                System.out.println("Exit");
//        }


        // new version
        switch (choice) {
            case 1 -> {
                if (choice >= 1) {
                    System.out.println("one");
                }
            }
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4, 5, 6, 7, 8, 9, 10 -> System.out.println("enything");
            default -> System.out.println("Exit");
        }


        System.out.println("Введіть місяць");
        String month = sc.next();
        switch (month){
            case "september", "october", "november":
                System.out.println("autumn");
        }
    }
}
