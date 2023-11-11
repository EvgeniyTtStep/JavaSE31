package org.itstep.lesson22.exceptions;

public class App1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        if (b != 0) {
            System.out.println(a / b);
        }

        int[] arr = new int[5];
        int num = 5;
        if(num >= 0 && num < arr.length) {
            System.out.println(arr[num]);
        }


        System.out.println("End program");
    }
}
