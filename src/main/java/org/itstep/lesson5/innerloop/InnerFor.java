package org.itstep.lesson5.innerloop;

public class InnerFor {
    public static void main(String[] args) {

        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < k + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


