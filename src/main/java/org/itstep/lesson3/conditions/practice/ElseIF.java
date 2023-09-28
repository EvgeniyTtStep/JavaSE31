package org.itstep.lesson3.conditions.practice;

import java.util.Scanner;

public class ElseIF {
    //Програма робить скидку для пенсіонерів та школлярів
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ваш вік");
        int age = 0;
        double amount = 1000;


        if (sc.hasNextInt()) {
            age = sc.nextInt();
            if(age >= 7 && age <= 90){
                if(age >= 7 && age <=18){
                    amount = amount * 0.6;
                    System.out.println("Ціна товару = " + amount);
                }else if (age > 18 && age < 60){
                    System.out.println("Ціна товару = " + amount);
                }else {
                    amount = amount * 0.75;
                    System.out.println("Ціна товару = " + amount);
                }
            }else {
                System.out.println("Для вашого віку все безкоштовно");
            }
        }else {
            System.out.println("Невірні дані, спробуйте ще");
        }

    }
}
