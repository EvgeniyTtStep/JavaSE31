package org.itstep.lesson13;

public class Hw {
    public static void main(String[] args) {
        int numberToCheck = 509; // Замініть на ваше число для перевірки
        boolean isPrime = isPrimeNumber(numberToCheck);

        if (isPrime) {
            System.out.println(numberToCheck + " є простим числом.");
        } else {
            System.out.println(numberToCheck + " не є простим числом.");
        }
    }

    // Метод для перевірки, чи число є простим
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
