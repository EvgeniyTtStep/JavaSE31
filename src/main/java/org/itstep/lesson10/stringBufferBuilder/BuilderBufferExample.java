package org.itstep.lesson10.stringBufferBuilder;

public class BuilderBufferExample {
    public static void main(String[] args) {

        String str = "Hello";
        str = str + " " + "Jack";
        str +=  " How are you";

        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("capacity() = " + stringBuilder.capacity());
        stringBuilder.append(" ");
        stringBuilder.append("I am fine!!!!!!!");
        System.out.println("capacity() = " + stringBuilder.capacity());

        System.out.println(stringBuilder);







    }

}
