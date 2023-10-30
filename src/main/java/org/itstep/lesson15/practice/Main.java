package org.itstep.lesson15.practice;

public class Main {
    //Завдання 3
    // Створіть клас Money (Гроші) для роботи з грошовими сумами.
    // Число має бути представлене двома полями:
    //  типу long – для гривень;
    //  типу byte – для копійок.
    // Реалізуйте виведення значення на екран,
    // при цьому дробова частина має бути відокремлена комою від цілої частини.
    // Реалізуйте
    // додавання,
    // віднімання,
    // ділення сум,
    // *ділення суми на дробове число,
    // *множення на дробове число
    // та операції порівняння.
    public static void main(String[] args) {
        Money money = new Money(-10L, (byte) 99);
        money.show();
        money.add(7L, (byte) 99);
        money.show();
        money.add(5, (byte) 50);
        money.show();

        double a = 0.7;
        double b = 0.2;
        System.out.println(a-b);
    }
}
