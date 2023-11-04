package org.itstep.lesson19;

public class Application {
    public static void main(String[] args) {
        Integer in = 10;
        int x = in;//розпакування

        double d = 15.5;
        Double d1 = d;//автоупакування

        //pars...
        int num = Integer.parseInt("19587");
        System.out.println(num);

        double nimD = Double.parseDouble("29.5");
        System.out.println(nimD);


        double doubleValue = in.doubleValue();
        int intValue = d1.intValue();

        Number n = 15;
    }
}
