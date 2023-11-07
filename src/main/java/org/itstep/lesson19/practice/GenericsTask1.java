package org.itstep.lesson19.practice;

public class  GenericsTask1  {
    //Завдання 1:
    // Напишіть шаблонний метод,
    // який повертає максимум
    // з трьох переданих параметрів.

    public static void main(String[] args) {
        System.out.println(method(12, 25, 87));
        System.out.println(method(129.7F, 25.6, 50));
        int a = 10;
        int b = 20;
        int c = 30;
        method(a,b,c);
    }

    public static <T extends Number> T method(T num1, T num2, T num3) {
        T max;
        if (num1.doubleValue() > num2.doubleValue()) {
            return max = num1;
        } else if (num2.doubleValue() > num3.doubleValue()) {
            return max = num2;
        } else {
            return max = num3;
        }
    }




}
