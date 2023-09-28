package org.itstep.lesson3;

public class Hw10 {

    //Завдання 10
    //Напишіть програму розрахунку ідеальної ваги до зросту. В
    //константах зберігаються зріст (height) і вага (weight). Виведіть в
    //консоль повідомлення про те, скільки кілограм потрібно набрати
    //або скинути (ідеальна вага = зріст - 110).
    public static void main(String[] args) {


        int height = 180;
        int weight = 80;

        int ideal = height - 110;//70

        System.out.println("Якщо true = " + (weight > ideal) + " то вам треба схуднути " + (weight - ideal) + " ");
        System.out.println("Якщо true = " + (weight < ideal) + " то вам треба набрати " + (ideal-weight) + " ");

    }
}
