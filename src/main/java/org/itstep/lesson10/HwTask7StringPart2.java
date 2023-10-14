package org.itstep.lesson10;

import java.util.Arrays;

public class HwTask7StringPart2 {
    //Завдання 7
    //Користувач вводить з клавіатури будь-який рядок. Змініть у
    //початковому рядку всі великі літери на маленькі, а маленькі —
    //великими. Якщо в рядку є цифри, замініть їх на символи
    //підкреслення, і виведіть результат у консоль.


    public static void main(String[] args) {

        String str = "ghd3sf6Sgj8df0fdgF";


        System.out.println(str);

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                chars[i] = '_';
            }
            if(Character.isLowerCase(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
            }else if (Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }

        //str = new String(chars); //var1
        str = String.valueOf(chars); //var2

        System.out.println("str = " + str);


    }
}
