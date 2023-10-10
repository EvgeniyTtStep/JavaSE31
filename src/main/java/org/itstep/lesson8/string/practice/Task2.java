package org.itstep.lesson8.string.practice;

import java.util.Scanner;

public class Task2 {
    //Завдання 2: Користувач вводить з клавіатури рядок та слово для пошуку.
    // Підрахуйте, скільки разів у рядку зустрічається шукане слово.
    // Отримане число виведіть на екран.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lorem = """
         Lorem Ipsum is java simply dummy
         text of the printing and typesetting industry.
          Lorem Ipsum has been the industry's standard
           dummy text ever since the 1500s, when an unknown
           printer took a galley java of type and scrambled it to 
           make a type specimen book. It has Java survived not only
            five centuries, but also the leap into electjavaronic typesetting,
             remaining essentially unchanged. It was popularised in the
              1960s with JAVa the release of Letraset sheets containing 
              Lorem Ipsum passages, and java more javAAAA recently with desktop 
              publishing software like Aldus PageMaker including versions of Lorem Ipsum java.
              """;

        System.out.println("Enter search word");
        String search = sc.nextLine().toLowerCase();
        int count=0;

        int index = lorem.toLowerCase().indexOf(search);
        while (index != -1){
            System.out.println("index = " + index);
            index = lorem.toLowerCase().indexOf(search,index+1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
