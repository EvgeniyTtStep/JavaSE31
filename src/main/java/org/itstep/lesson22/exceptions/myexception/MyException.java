package org.itstep.lesson22.exceptions.myexception;

public class MyException extends RuntimeException {

    int first, second;

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(int first, int second) {
        if(second == 0){
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException e){
                System.out.println("ділення на нуль");
            }
        }
    }
}


class Main{

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        try {
            throw new MyException(a, b);
        }catch (MyException e){

        }

        if(b > a){
            throw new MyException("B > A");
        }



    }
}