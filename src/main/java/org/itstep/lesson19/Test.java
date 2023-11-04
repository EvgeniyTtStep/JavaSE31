package org.itstep.lesson19;

public class Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int sum = 1;
        for (int i = 0; i < 2_000_000_000; i++) {
            sum = sum + 1;
        }
        long end = System.currentTimeMillis();

        System.out.println("res = " + (end - start));
        //System.out.println(sum);
    }
}
