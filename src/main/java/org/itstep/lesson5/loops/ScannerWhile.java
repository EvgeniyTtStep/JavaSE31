package org.itstep.lesson5.loops;

import java.util.Random;
import java.util.Scanner;

public class ScannerWhile {

    //Гра - вгадай число
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int robotNum = random.nextInt(10, 100);
        int count = 0;
        int num;

        System.out.println("robotNum = " + robotNum);

        System.out.println("Гра вгадай число");
        System.out.println("Введіть число");


        while ((num = sc.nextInt()) != 0) {
            System.out.println("Спроба " + ++count + " num = " + num);
            if (num == robotNum) {
                System.out.println("Ти вградав");
                break;//зупиняє цикл
            } else {
                System.out.println("Не вгадав\n");
                if (count < 3) {
                    System.out.println("Введіть число");
                }else {
                    break;
                }
            }
        }
    }
}
