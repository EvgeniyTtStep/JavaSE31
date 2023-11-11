package org.itstep.lesson22.exceptions;


// різні вийняткові ситуації
public class App4 {

    public static void main(String[] args) {
        //System.out.println(method());
        System.out.println(method1(method()));
    }


    @SuppressWarnings("finally")
    public static int method() {
        try {
            return 0;
        } finally {
            return 1;//пербиваем візов finally
        }
    }

    public static int method1(int arg) {
        if (arg % 2 == 0) {
            return arg * arg;
        }
        return 0;
        //throw new RuntimeException();
    }


}
