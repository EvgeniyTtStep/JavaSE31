package org.itstep.lesson11.practice;

public class MethodsTask5 {
    //Напишіть метод, який повертає суму чисел у вказаному діапазоні.
    // Межі діапазону передаються як параметри.
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        System.out.println(summa(a, b));
    }

    public static int summa(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum = sum + i;
        } return
                sum;
    }

    public static int summa(int a, byte b){
        return 0;
    }





}
