package org.itstep.lesson9.string.practice;

public class Task5Practice {
    //Завдання 5:
    //Маємо певний текст. Реалізуйте до нього наступну
    //функціональність:
    //+- Змініть текст таким чином, щоб кожне речення починалася з
    //великої літери.
    //+ Підрахуйте кількість цифр у тексті.
    //+ Підрахуйте кількість розділових знаків у тексті.
    //+ Порахуйте кількість речень у тексті.

    public static void main(String[] args) {

        String lorem = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout! the point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English? many desktop publishing packages: and web page editors now use Lorem - Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";



        //+- Змініть текст таким чином, щоб кожне речення починалася з
        //великої літери.
        String newLorem = "";
        //String[] sentences = lorem.split("[.!?]");
        String[] sentences = lorem.split("(?<=\\.|!|\\?)");
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].strip();
            char[] chars = sentence.toCharArray();
            if (Character.isLowerCase(sentence.charAt(0))) {
                chars[0] = Character.toUpperCase(sentence.charAt(0));
                sentence = String.valueOf(chars);
            }
            System.out.println(sentence);
            newLorem += sentence + ". ";
        }
        //System.out.println(newLorem);

        // Підрахуйте кількість цифр у тексті.
        // Підрахуйте кількість розділових знаків у тексті.
        int digit = 0;
        int punctuation = 0;
        for (int i = 0; i < lorem.length(); i++) {
            char ch = lorem.charAt(i);
            if (Character.isDigit(ch)) {
                digit++;
            }

            if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                System.out.println("ch = " + ch);
                punctuation++;
            }
        }

        System.out.println("digit = " + digit);
        System.out.println("punctuation = " + punctuation);


    }
}
