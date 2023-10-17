package org.itstep.lesson11.methods;

import static java.lang.Math.*;

public class MethodsExample {

    public static void main(String[] args) {
        sum();
        sum(7, 51);
        long res = sum(10L, 27L);
        long res1 = sum1();
        System.out.println("res = " + res);
        System.out.println("res1 = " + res1);

    }


    // 1 - метод нічого не повертає, та не прймає параметрів
    public static void sum() {
        System.out.println(10 + 20);
    }

    // 2 - метод що приймає параметри, але нічого не повертає
    public static void sum(int first, int second) {//сигнатура методу це:
        // 1 - назва методу
        // 2 - тип парамерту
        // 3 - кількість параметрів
        System.out.println(first + second);
    }

    // 3 - метод що приймає параметри, та повертає результат
    public static long sum(long one, long two) {
        return one + two;
    }

    // 4 - не приймає параметри, але повертає рузультат
    public static long sum1() {
        return round(random() * 10) * round(random() * 10);
    }


}
