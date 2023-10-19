package org.itstep.lesson12.recursion;

public class Recursion {

    public static void main(String[] args) {
        method(45);
    }

    public static int method(int a) {
        a--;
        int res = method(a);
        System.out.println("a = " + a);
        return res;
    }


}
