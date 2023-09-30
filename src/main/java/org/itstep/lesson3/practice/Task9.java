package org.itstep.lesson3.practice;

public class Task9 {
    //Завдання 9
    //Перевірте, чи має число речову частину. Наприклад, числа 3.14 та
    //2.5 мають речову частину, а числа 5.0 і 10.0 — ні.

    public static void main(String[] args) {

        double pi = 3.0000000014;
        double num = 5.0;

        int res = (int)pi; // 3
        double res1 = pi - res; // 0.14
        System.out.println(res1 > 0);// true


        double res3 = pi*10;






    }
}
