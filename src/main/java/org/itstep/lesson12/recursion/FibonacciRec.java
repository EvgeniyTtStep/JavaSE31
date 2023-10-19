package org.itstep.lesson12.recursion;

public class FibonacciRec {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    private static int fib(int arg) {
        if(arg==1 || arg ==2){
            return 1;
        }
        return fib(arg - 1) + fib(arg - 2);
    }
}
