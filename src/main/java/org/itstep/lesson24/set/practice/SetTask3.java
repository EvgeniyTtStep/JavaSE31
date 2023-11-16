package org.itstep.lesson24.set.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTask3 {
    //Завдання 3:
    // Реалізуйте базу даних податкової інспекції зі штрафів.
    // Ідентифікувати кожну людину буде персональний ідентифікаційний код.
    // В однієї людини може бути багато штрафів.
    // Реалізуйте:
    // 1. Повний друк бази даних.
    // 2. Друк даних за вказаним кодом.
    // 3*. Друк даних за певним типом штрафу.
    // 4. Друк даних за вказаним містом.
    // 5. Додавання нової людини з інформацією про неї.
    // 6*. Додавання нових штрафів для вже існуючого запису.
    // 7*. Видалення штрафу.
    // 8. Заміна інформації про людину та її штрафи.


    public static void main(String[] args) {
        Fine fine = new Fine("за парковку");
        Fine fine1 = new Fine("за несплату податків");
        Fine fine3 = new Fine("за вигул собаки");
        Fine fine4 = new Fine("за ухилення від аліментів");


        Set<Human> humanSet = new HashSet<>();
        humanSet.add(new Human("Jack",123, "Kyiv", new ArrayList<>(List.of(fine1, fine3))));
        humanSet.add(new Human("Max",234, "Dnipro", new ArrayList<>(List.of(fine, fine4))));


        for (Human human : humanSet) {
            human.show();
            System.out.println("--------------");
        }

    }

}
