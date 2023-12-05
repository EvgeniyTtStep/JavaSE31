package org.itstep.lesson30_31.multithreadind;

import java.util.concurrent.Semaphore;

public class Application6_0 {

    static class Player extends Thread {
        Semaphore semaphore;

        public Player(String name, Semaphore semaphore) {
            super(name);
            this.semaphore = semaphore;
            start();
        }

        @Override
        public void run() {

            System.out.println("Player is ready " + getName());
            try {
                semaphore.acquire(); //следит за порядком потоков
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(getName() + "is starting");



            semaphore.release();//отпускает ждущие потоки

        }


    }


    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        new Player("one", semaphore);
        new Player("two", semaphore);
        new Player("three", semaphore);
        new Player("four", semaphore);
        new Player("five", semaphore);
        new Player("six", semaphore);
    }
}
