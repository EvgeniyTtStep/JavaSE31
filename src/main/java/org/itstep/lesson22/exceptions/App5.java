package org.itstep.lesson22.exceptions;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class App5 {
    public static void main(String[] args){

        try {
            throw new ArithmeticException("Моя виключна ситуація");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            try {
                throw new NoSuchElementException();
            } catch (NoSuchElementException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Внутрішне перехоплення");
            }
        }

        try {
            throwsEx2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    //за обробку FileNotFoundException() відповідає той хто викликає цей метод
    public static void throwsEx1() throws FileNotFoundException {
        throw new FileNotFoundException("file not found");
    }

    public static void throwsEx2() throws FileNotFoundException {
        throwsEx1();
    }


}
