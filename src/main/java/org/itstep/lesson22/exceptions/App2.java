package org.itstep.lesson22.exceptions;


//обробка вийнятковий ситуацій try catch
public class App2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace(); //bad code
        }


        int[] arr = new int[5];
        int num = 5;
        try {
            System.out.println(arr[num]);
        } catch (IndexOutOfBoundsException e) {
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }






        System.out.println("End program");
    }
}
