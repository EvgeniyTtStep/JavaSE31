package org.itstep.lesson19.generics.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
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
public class MyArray<T extends Number> {

    T[] arr;


    public void fillKeyBoardArr(Class<T> clazz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        arr = (T[]) Array.newInstance(clazz, size);
        for (int i = 0; i < arr.length; i++) {
            Object tmp = null;
            if (clazz.isAssignableFrom(Integer.class)) {
                tmp = scanner.nextInt();
            } else if (clazz == Double.class) {
                tmp = scanner.nextDouble();
            }
//          tempArr[i] = (T)tmp;
            arr[i] = clazz.cast(tmp);
        }
    }

    public void fillRandomArr() {
        Random random = new Random();
    }
}


class Main{
    public static void main(String[] args) {
        MyArray<Double> myArray = new MyArray<>();
        myArray.fillKeyBoardArr(Double.class);
        System.out.println(Arrays.toString(myArray.arr));
    }
}
