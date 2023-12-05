package org.itstep.lesson30_31.multithreadind;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Application6_1 {

    static class Player extends Thread {
        CyclicBarrier cyclicBarrier;

        public Player(String name, CyclicBarrier cyclicBarrier) {
            super(name);
            this.cyclicBarrier = cyclicBarrier;
            start();
        }

        @Override
        public void run() {

            System.out.println("Player is ready " + getName());

            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(getName() + "is starting");

        }


    }


    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        new Player("one", cyclicBarrier);
        new Player("two", cyclicBarrier);
        new Player("three",cyclicBarrier);
        new Player("four", cyclicBarrier);
        new Player("five", cyclicBarrier);
        new Player("six", cyclicBarrier);
    }
}
