package org.itstep.lesson7;

public class InnerLoopTask4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("* ");
                } else if (j == 4 || j == 0) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



        int x = 6;
        for (int i = 0; i < 6; i++) {
            x--;
            for (int j = 0; j < 6; j++) {
                if (i == 5) {
                    System.out.print("* ");
                } else if (j == 5 || j == x) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
