package org.itstep.Lesson18.generics.practice;

import java.util.Random;
import java.util.Scanner;

//Завдання 1: Створіть шаблонний клас Array,
// який являє собою масив,
// в якому зберігаються об'єкти заданого типу.
// Реалізуйте:
//  заповнення масиву з клавіатури;
//  заповнення масиву випадковими числами;
//  відображення масиву;
//  пошук максимального значення;
//  пошук мінімального значення;
//  підрахунок середнього арифметичного значення.
//  сортування масиву за зростанням;
//  сортування масиву за спаданням;
//  пошук значення в масиві, використовуючи бінарний пошук;
//  заміну значення в масиві на нове значення.
public class MyArray <T extends Number>{

    T [] arr;


    public void fillKeyBoardArr(){
        Scanner scanner = new Scanner(System.in);

    }

    public void fillRandomArr(){
        Random random = new Random();

    }

}
