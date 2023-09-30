package org.itstep.lesson4.loops;

public class LoopForExample {
    public static void main(String[] args) {
        int num = 10;


        //===== for =====
        for(int i = 0; i < 5; i++){ // i += 1;
            System.out.println("Hello = " + num++ + " " + i);
        }

        System.out.println("====================");

        num = 10;
        for (;num >= 0;){
            System.out.println("num = " + num--);
        }

        for(int i = 0, j = 10; i <= j ; i++, --j)
        {
            System.out.println("i = " + i + " j = " + j);
        }



        //===== while ====

    }
}
