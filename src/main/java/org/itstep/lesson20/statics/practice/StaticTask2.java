package org.itstep.lesson20.statics.practice;

public class StaticTask2 {
    //Завдання 2:
    // Створіть клас для розрахунку площі геометричних фігур.
    // Клас має надавати функціональність для підрахунку площі
    // трикутника за різними формулами,
    // площі прямокутника,
    // площі квадрата,
    // площі ромба.

    // Методи класу для підрахунку площі реалізуйте
    // за допомогою статичних методів.
    // Також клас має розрахувати кількість підрахунків площі
    // та повернути це значення статичним методом.

    public static void main(String[] args) {
        System.out.println(Shape.rombSquare(15, 30));
        System.out.println(Shape.rombSquare(16, 30));
        System.out.println(Shape.rombSquare(17, 30));
        System.out.println(Shape.rombSquare(18, 30));
        System.out.println(Shape.rombSquare(19, 30));
        System.out.println(Shape.getCount());
    }
}
