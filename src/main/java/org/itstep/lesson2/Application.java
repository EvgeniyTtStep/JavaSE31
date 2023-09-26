package org.itstep.lesson2;

public class Application {
    public static void main(String[] args) {
       //неявне перетворення byte - long
        byte b = 12;
        long l = b;

        //явні перетворення int - short
        int i = 500000000;
        short sh = (short) i;

        //втрата даних
        int i1 = 130;
        byte b1 = (byte) i1;// ----------0+++++++++++
        System.out.println("b1 = " + b1);

        //константа
        final int num = 15;
        //не можна змінювати
        //num = 20;











    }
}
