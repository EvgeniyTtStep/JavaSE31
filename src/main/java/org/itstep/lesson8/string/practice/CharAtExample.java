package org.itstep.lesson8.string.practice;

public class CharAtExample {

    public static void main(String[] args) {
        //            0123456...
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        int countS = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 's'){
                System.out.println("index = " + i);
                countS++;
            }
        }
        System.out.println("countS = " + countS);
    }
}
