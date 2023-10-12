package org.itstep.lesson9.string.practice;

public class Task4 {
    //Завдання 4
    //Введіть рядок з клавіатури (латиницею). Із введеного рядка
    //виберіть всі слова, які починаються з голосних літер і
    //закінчуються приголосними. Виведіть відібрані слова у консоль.

    public static void main(String[] args) {
        String vowels = "eioayu";
        String lorem = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout! the point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English? many desktop publishing packages: and web page editors now use Lorem - Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        String[] words = lorem.toLowerCase().split("[' ,.!?:()-]");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isBlank() && words[i].length() > 1) {
                if (vowels.contains(String.valueOf(words[i].charAt(0))) &&
                        !vowels.contains(String.valueOf(words[i].charAt(words[i].length()-1)))){
                    System.out.println(words[i]);
                }
            }
        }
    }
}