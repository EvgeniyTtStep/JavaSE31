package org.itstep.lesson12.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int arg) {
        int res;
        if (arg == 1) {
            return 1;
        } else if (arg == 2) {
            return 2;
        }
        res = fact(arg - 1) * arg;
        return res;
    }
}
