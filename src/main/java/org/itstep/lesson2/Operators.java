package org.itstep.lesson2;

public class Operators {

    public static void main(String[] args) {

        //Arithmetic
        int first = 17;
        int second = 3;

        System.out.println((double) first / second);
        System.out.println(first % second);

        System.out.println("increment");
        int count = 9;
        System.out.println("count = " + count);
        System.out.println("count = " + count++);//postfix
        System.out.println("count = " + count);
        System.out.println("count = " + ++count);//prefix


        System.out.println("decrement");
        System.out.println("count = " + count);
        System.out.println("count = " + count--);//postfix
        System.out.println("count = " + count);
        System.out.println("count = " + --count);//prefix


        System.out.println("Операції порівняння");
        System.out.println(" > " + (first > second));
        System.out.println(" < " + (first < second));
        System.out.println(" >= " + (first >= second));
        System.out.println(" <= " + (first <= second));
        System.out.println(" == " + (first == second));
        System.out.println(" != " + (first != second));


        System.out.println("логічні оператори");
        boolean res1 = 3 >= (2+30) % 7 && 5 >= 10/2;// &&   &

        System.out.println("res1 = " + res1);

        boolean res2 = true || false && true;
        System.out.println("res2 = " + res2);

        //оператори  +=  *=  /=  -=
        //Збільшити число на 10

        //варінт1
//        int num = 32;
//        final int ten = 10;
//        int result = num + ten;
//        num = result;

        //варінт2
//        int num = 32;
//        final int ten = 10;
//        num = num + ten;

        //варінт3
        int num = 32;
        num /= 10; //num = num + ten;

        System.out.println("num = " + num);

    }
}
