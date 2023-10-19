package org.itstep.lesson12.recursion;

import java.util.Scanner;

public class Practice1 {
    //Користувач вводить позитивне число з клавіатури, а система виводить у консоль
    //усі числа від введеного,до 0.
    // При вирішенні цього завдання спробувати використати рекурсію

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pos num");
        int num = sc.nextInt();//45

        //printClassicNum(num);
        printNums(num);
    }

    //classic solution
    public static void printClassicNum(int num) {
        for (int i = num; i >= 0 ; i--) {
            System.out.print(i + " ");
        }
    }

    //recursion solution
    public static void printNums(int num){
        if(num == 0){
            System.out.print(num + " ");
        } else if (num < 0) {
            System.out.println("Wrong num. Must be pos num");
        }else {
            System.out.print(num + " ");
            num--;
            printNums(num);
        }
    }



}
