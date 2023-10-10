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
        System.out.println(login);


        // ===== getBytes() == toCharArray() =====
        byte[] loginBytes = login.getBytes();
        char[] loginChars = login.toCharArray();


        // ===== contains() =====
        String password = "rexABCabc123ABC@.png";
        System.out.println("contains = " + password.contains("ABC@"));

        // ==== startsWith()  === endsWith() ====
        System.out.println("starts = " + password.startsWith("123"));
        System.out.println("ends = " + password.endsWith(".png"));


        //==== indexOf() ====

        int index = password.indexOf("ABC");
        System.out.println("index = " + index);


        index = password.indexOf("ABC", 4);
        System.out.println("index = " + index);


        // ==== replace() ====

        String name = "Hello Jack";
        System.out.println(name.replace("Jack", "Max"));

        String test  = "a a b c s sd f        h";
        System.out.println(test.replace(" ", ""));


    }
}
