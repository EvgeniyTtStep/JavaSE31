package org.itstep.lesson28.IO.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FileTask3 {
    //Завдання 3:
    //Користувач вводить з клавіатури шлях до файлу та слово для
    //пошуку. Після роботи програми на екрані відображається
    //кількість разів, скільки слово зустрічається у файлі.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву файлу");
        String fileName = scanner.nextLine();
        System.out.println("Введіть слово для пошуку");
        String word = scanner.nextLine();

        String file = task3(fileName);

        int index = 0;
        int count = 0;

        while (index != -1) {
            index = file.indexOf(word, index + 1);
            count++;
        }

        System.out.println("Слово " + word + "зустрічається " + count + " разів");


    }

    private static String task3(String fileName) {

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            char[] buf = new char[1024];
            int length = read.read(buf);
            return new String(buf, 0, length);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
