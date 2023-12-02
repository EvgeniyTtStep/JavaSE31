package org.itstep.lesson30.multithreadind;

import java.time.LocalTime;

public class Application2 {

    static class WorkerThread extends Thread {

        long sum = 0;
        @Override
        public void run() {
            System.out.println("Start worker " + LocalTime.now());
            for (long i = 0L; i < 5_000_000_000L; i++) {
                sum += 1;
                if(isInterrupted()){
                    System.out.println("Worker is interrupted sum = " + sum);
                    break;
                }
            }
            System.out.println("End worker " + LocalTime.now());
        }
    }

    static class SleepThread extends Thread{
        @Override
        public void run() {

            System.out.println("Start sleep " + LocalTime.now());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End sleep " + LocalTime.now());

        }
    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start main  " + LocalTime.now());

        WorkerThread worker = new WorkerThread();
        SleepThread sleep = new SleepThread();
        //worker.setDaemon(true);
        //sleep.setDaemon(true);

        worker.start();
        sleep.start();

        //worker.join();//просять метод main почекати поки потік буде worker завершений
        //sleep.join();//просять метод main почекати поки потік буде sleep завершений

        //sleep.interrupt();//зупиняємо потік
        worker.interrupt();

        Thread.sleep(100);
        System.out.println("sum = " +  worker.sum);
        System.out.println("End main  " + LocalTime.now());

    }

}
