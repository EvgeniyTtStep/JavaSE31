package org.itstep.lesson3.conditions;

public class ApplicationIfElse {
    public static void main(String[] args) {

        // if(умова){
        //  тіло оператора
        // }

        final int condition = 10;
        int x = 10;

        if (x <= condition) {
            System.out.println(x + " менший або дорівнює за " + condition);
        }

        // if(умова){
        //  тіло оператора if
        // }else{
        //   тіло оператора else
        // }

        if (x < condition || x > condition) {
            System.out.println(" < > ");
        } else {
            System.out.println("Умова if не виконана " + x + " == " + condition);
        }

        // if(умова){
        //  тіло оператора if
        // }else if(умова){
        //    тіло оператора else-if
        // }else if(умова){
        //    тіло оператора else-if
        // }else{
        //    тіло оператора else
        // }

        if (x > condition) {
            System.out.println(" > ");
        } else if (x < condition) {
            System.out.println(" < ");
        } else {
            System.out.println(" == ");
        }
    }
}
