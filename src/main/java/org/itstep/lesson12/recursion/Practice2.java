package org.itstep.lesson12.recursion;

import java.util.Scanner;

public class Practice2 {
    //Користувач вводить з клавіатури суму, яку хоче взяти в кредит, і також суму
    //яку він виплачуватиме щомісяця. У консоль виводиться порядковий номер місяця,
    // і сума, що залишилася для виплати кредиту. Як тільки кредит погашено, у консоль виводиться
    //Фраза: Кредит погашений за {у місяців}.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        int credit = sc.nextInt();
        System.out.println("Enter month sum");
        int monthSum = sc.nextInt();
        int monthNum = 0;

        while (credit > 0) {
            monthNum++;
            credit -= monthSum;
        }

        System.out.println("Кредит погашено за " + monthNum + " місяців");

    }
}
