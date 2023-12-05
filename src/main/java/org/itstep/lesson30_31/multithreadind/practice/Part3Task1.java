package org.itstep.lesson30_31.multithreadind.practice;

public class Part3Task1 {
    //Напишите класс, реализующий интерфейс Runnable, содержащий поле-счетчик. Метод run()
//должен наращивать этот счетчик. Создайте пять экземпляров этого класса и запустите их в пяти
//потоках с разными приоритетами. После 3 секунд работы остановите потоки и сравните значения
//счетчиков.

    public static void main(String[] args) {
        //пример того как задается приоритет
        Thread thread = new Thread();
        thread.setPriority(10);


        //hw - Создайте пять экземпляров этого класса и запустите их в пяти
        //потоках с разными приоритетами. После 3 секунд работы остановите потоки и сравните значения
        //счетчиков.

    }

    class CountThread implements Runnable {
        int count = 0;

        @Override
        public void run() {
            System.out.println("Start " + Thread.currentThread().getName() + " priority = " + Thread.currentThread().getPriority());
            while (true) {
                count++;
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("End " + Thread.currentThread().getName() + " priority = " + Thread.currentThread().getPriority());
                    break;
                }
            }
        }
    }


}
