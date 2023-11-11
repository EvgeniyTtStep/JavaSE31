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

    public <T> void sortHi(T[] mas) {
        Arrays.sort(mas);
        System.out.println("Массив отсортированный по возрастаанию : " + Arrays.toString(mas));
    }

    public <T> void sortLow(T[] mas) {
        Arrays.sort(mas);
        T num;
        for (int i = 0; i < mas.length / 2; i++) {
            num = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = num;
        }
        System.out.println("Массив отсортированный по убыванию: " + Arrays.toString(mas));
    }

    public void binary(T[] mas, T a) {
        int num = 0;
        int index = 0;
        Arrays.sort(mas);
        for (T value : mas) {
            if (a.equals(value)) {
                index = 1;
                num += 1;
            }
        }
        if (index == 1) {
            System.out.println("Индекс заданной переменной а = " + a + " будет равно :" + Arrays.binarySearch(mas, a));
            System.out.println("Всего совпадений : " + num);
        } else {
            System.out.println("Значение переменной а = " + a + " в нашем массиве отсутствует");
        }
    }

    public <T> T[] changeElement(T[] mas, int index, Class<T> clazz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение переменной , на которую надо заменить :");
        Object element = null;
        if (clazz == Integer.class && scanner.hasNextInt()) {
            element = scanner.nextInt();
            mas[index] = (T) element;
        }
        if (clazz == Double.class && scanner.hasNextDouble()) {
            element = scanner.nextDouble();
            mas[index] = (T) element;
        }
        if (clazz == String.class && scanner.hasNextLine()) {
            element = scanner.nextLine();
            mas[index] = (T) element;
        }
        return mas;
    }


}


class Main{
    public static void main(String[] args) {
        MyArray<Double> myArray = new MyArray<>();
        myArray.fillKeyBoardArr(Double.class);
        System.out.println(Arrays.toString(myArray.arr));
    }
}
