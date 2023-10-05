package org.itstep.lesson6.loopcontinue;

public class ContinuExample {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(" " + i);
        }

    }
}
