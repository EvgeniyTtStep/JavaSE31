package org.itstep.lesson8.string.practice;

public class CharArrExample {
    public static void main(String[] args) {

        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        char[]chars = str.toCharArray();


        int countA = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'a'){
                System.out.println("index = " + i);
                countA++;
            }
        }

        System.out.println("countA = " + countA);

    }
}
