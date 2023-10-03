package org.itstep.lesson5;

import java.util.Random;

public class Hw3 {

    public static void main(String[] args) {
        System.out.println("1 - камінь");
        System.out.println("2 - ножниці");
        System.out.println("3 - бумага");

        Random random = new Random();

        int robotChoice = random.nextInt(1,4);
        System.out.println("Tnter your choce");
        int userChoice = 2;

        System.out.println("robotChoice = " + robotChoice);
        System.out.println("userChoice = " + userChoice);

        if(robotChoice == 1 && userChoice == 2){
            System.out.println("Robot win");
        }
        if(robotChoice == 1 && userChoice == 3){
            System.out.println("User win");
        }
        if(robotChoice == 2 && userChoice == 1){
            System.out.println("User win");
        }
        if(robotChoice == 2 && userChoice == 3){
            System.out.println("Robot win");
        }
        if(robotChoice == 3 && userChoice == 1){
            System.out.println("Robot win");
        }
        if(robotChoice == 3 && userChoice == 2){
            System.out.println("User win");
        }
        if(robotChoice == 1 && userChoice ==1
                || robotChoice == 2 && userChoice == 2
                || robotChoice == 3 && userChoice ==3){
            System.out.println("Nichiya");
        }
    }
}
