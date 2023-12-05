package org.itstep.lesson30_31.multithreadind;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Application6_2 {
    static class Player extends Thread {
        CountDownLatch countDownLatch;

        public Player(String name, CountDownLatch countDownLatch) {
            super(name);
            this.countDownLatch = countDownLatch;
            start();
        }

        @Override
        public void run() {

            System.out.println("Player is ready " + getName());

            try {
                countDownLatch.await(3, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            countDownLatch.countDown();

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
        new Application6_1.Player("one", cyclicBarrier);
        new Application6_1.Player("two", cyclicBarrier);
        new Application6_1.Player("three",cyclicBarrier);
        new Application6_1.Player("four", cyclicBarrier);
        new Application6_1.Player("five", cyclicBarrier);
        new Application6_1.Player("six", cyclicBarrier);
    }
}
