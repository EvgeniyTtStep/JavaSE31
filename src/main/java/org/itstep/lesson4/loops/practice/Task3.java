package org.itstep.lesson4.loops.practice;

public class Task3 {
    public static void main(String[] args) {
        //Завдання 3:
        // Користувач вводить з клавіатури два числа.
        // Вкажіть усі непарні числа у заданому діапазоні.
        // Якщо межі діапазону вказані неправильно,
        // потрібно провести нормалізацію меж.
        // Наприклад, користувач ввів 20 і 11.
        // Потрібно провести нормалізацію,
        // після якої початок діапазону дорівнюватиме 11,
        // а кінець дорівнюватиме 20.


        int first = 20;
        int second = 11;

        // нормалізація діапазону
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }


        // f = 10 s = 20
        first = first + second; // 10 + 20 = 30
        second = first - second;// 30 - 20 = 10
        first = first - second; // 30 - 10 = 20


        for (int i = first; i < second; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
