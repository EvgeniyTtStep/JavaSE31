package org.itstep.lesson4;

public class TernarExample {

    public static void main(String[] args) {
        String res =  10 > 15 ? " > " : " <= ";
        System.out.println("res = " + res);
        System.out.println(54 > 98 ? "Ok" : "Error");
        String res1 = 27 != 14 ? "Ok" : 24 > 14 ? "Ok" : "Err";
        System.out.println("res1 = " + res1);
    }

}
