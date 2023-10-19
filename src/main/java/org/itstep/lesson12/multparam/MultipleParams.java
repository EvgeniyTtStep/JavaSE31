package org.itstep.lesson12.multparam;

import java.util.Arrays;
import java.util.List;

public class MultipleParams {
    public static void main(String[] args) {
        method(15);
        method(12, 56, 47, 89);
    }

    public static void method(int a) {
        System.out.println("a = " + a);
    }

    public static void method(int...param) {
        System.out.println(Arrays.toString(param));
    }



    //відбувається колізія підчас виклику методу
//    public static void method(int a, int...param) {
//        System.out.println(Arrays.toString(param));
//    }

//замість оператора ... можна передати масив
//    public static void method(int[]param) {
//        System.out.println(Arrays.toString(param));
//    }





}
