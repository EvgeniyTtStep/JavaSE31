package org.itstep.lesson22.exceptions;


import java.util.Scanner;

// finally
public class App3 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78};
        int first = 27;
        int second = 23;
        double third;

        Scanner scanner = null;

        try {
            third = first / second;
            System.out.println(third);
             scanner = new Scanner(System.in);
            arr[3] = (int) third;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            //System.exit(42); finally - не відпрацює
        } catch (Exception e) {

        } finally {
            if(scanner!= null){
                scanner.close();
            }
            System.out.println("Завжди відпрацює");
        }
    }
}
