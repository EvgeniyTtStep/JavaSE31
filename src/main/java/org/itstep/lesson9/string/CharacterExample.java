package org.itstep.lesson9.string;

public class CharacterExample {
    public static void main(String[] args) {

        int i = 10;
        Integer a = i;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);


        //методи перевіряють символи
        System.out.println(Character.isDigit('7'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isWhitespace(' '));


        //методи що змінюють символи
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('r'));

    }
}
