package org.itstep.lesson6.dowhile;

public class DoWhileExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        do {
            System.out.println("hello");
            b++;
        } while (a > b);
        System.out.println("b = " + b);

    }
}
