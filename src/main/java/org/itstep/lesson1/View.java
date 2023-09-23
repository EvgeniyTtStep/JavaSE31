package org.itstep.lesson1;

public class View {
    public static void main(String[] args) {

        String name = "Jack";
        int num = 15;
        String city = "Kiyiv";


        System.out.println("My name is" + name + ". I am a human");// + concut
        System.out.println("Мій кіт старий на " + num + " років");
        System.out.print("Я не перекидаю на новий рядок. ");
        System.out.println("Я на цьому ж рядку");

        System.out.printf("My name is %s. I am a human\n", name);// \n робить перехід на новий рядок
        System.out.printf("Мій кіт старий на %d років", num);
    }
}
