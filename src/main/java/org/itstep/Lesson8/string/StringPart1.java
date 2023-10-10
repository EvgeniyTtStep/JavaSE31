package org.itstep.Lesson8.string;

public class StringPart1 {
    public static void main(String[] args) {


        String str = "Jack";

        String str1 = new String("Jack");

        char[] chars = {'J', 'a', 'c', 'k'};
        String str2 = new String(chars);

        byte[] bytes = {65, 97, 102, 105, 109};
        String str3 = new String(bytes);


        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        String str4 = "Jack";

        System.out.println(str == str4);// string pool
        System.out.println(str == str1);//false

        // ==== equals() ====
        //рядки ЗАВЖДИ порівнюють через equals
        System.out.println(str.equals(str1));//true

        // ==== length() ====
        System.out.println("str.length() = " + str.length());

        // ==== charAt() ====
        System.out.println("charAt = " + str.charAt(0));

        //==== toLowerCase() ==== toUpperCase() ====
        String login = "HelloJAck";
        System.out.println("lower " + login.toLowerCase());
        System.out.println("upper " + login.toUpperCase());


    }
}
