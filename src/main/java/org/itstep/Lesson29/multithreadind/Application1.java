package org.itstep.Lesson29.multithreadind;

import static java.lang.Thread.currentThread;

public class Application1 {

    static class HelloRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable = " + currentThread().getName() + " "
                    + currentThread().getId());
        }
    }

    static class HelloThread extends Thread{

        @Override
        public void run() {
            System.out.println("Thread = " + currentThread().getName() + " "
                    + currentThread().getId());
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            HelloRunnable runnable = new HelloRunnable();
            Thread thread = new Thread(runnable);
            thread.start();

            Thread thread1 = new HelloThread();
            thread1.start();


            Thread thread2 = new Thread(() -> System.out.println("Anonim = " + currentThread().getName() + " "
                    + currentThread().getId()));
            thread2.start();

        }
    }

}
