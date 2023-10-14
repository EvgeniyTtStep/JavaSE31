package org.itstep.lesson10.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyTask3 {
    // В заданому рядку, який складається з окремих слiв,
    // вiдокремлених iнтервалом,
    // знайти слова в яких перша
    // та остання літери не спiвпадають мiж собою.

    public static void main(String[] args) {
        final String regex = "[a-zA-z]+";
        final String string = "Lorem Ipsum is simply woow dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled??? it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing! software like Aldus PageMaker including versions of Lorem Ipsum.";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            String word = matcher.group(0);
            if(word.charAt(0) != word.charAt(word.length()-1) && word.length() > 1){
                System.out.println(word);
            }
        }
    }
}
