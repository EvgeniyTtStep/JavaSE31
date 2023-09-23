package org.itstep.lesson1;

public class Types {
    public static void main(String[] s){

        //=== примітивні типи даних ===

        //== числові типи ==
        //цілі цисла
        byte b = 127; //-128 do 127 2^8 -2^7 do -2^7 -1
        short sh = 20; // 2^16 -2^15 do 2^15 -1
        int in = 999999999; //2^32 -2^31 do 2^31 -1
        long l = 999999999999999999L;  //2^64

        //дробові числа
        float fl = 15.5F; //(4 byte)
        double d = 15.5;  //(8 byte)

        //symbols
        char ch = 'A';//(2 byte)

        //logic
        boolean bool = true;//(1 byte)


        //особливість типів double(float)
        System.out.println(d/0);//Infinity
        System.out.println(-d/0);//-Infinity
        System.out.println(0.0/0.0);//Not a number


        //=== Силочні типи даних ===

        String name = "Jack";

        //Класи обгортки для примитивів
        Byte.parseByte("15");
        Short.valueOf("45");
        Integer.toString(15);
        Double.hashCode(15.0);

        Character.isDigit('9');

        Boolean.getBoolean("Hello");














    }
}
