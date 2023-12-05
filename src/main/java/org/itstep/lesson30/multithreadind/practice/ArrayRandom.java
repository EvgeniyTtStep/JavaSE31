package org.itstep.lesson30.multithreadind.practice;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    int length;
    final int[] arr;

    public ArrayRandom(int l) {
        this.length = l;
        this.arr = new int[l];
    }

    public synchronized void fullArr() {
        for (int i = 0; i < length; i++) {
            arr[i] = new Random().nextInt(10, 100);
        }
    }

    public synchronized int sumArr() {
        int sum = 0;
        try {
            if (Arrays.stream(arr).average().isPresent()) {
                sum = Arrays.stream(arr).sum();
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }

    public synchronized double averageArr() {
        double average = 0.0;
        try {
            if (Arrays.stream(arr).average().isPresent()) {
                average = Arrays.stream(arr).average().getAsDouble();
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return average;
    }


    public static void main(String[] args) throws InterruptedException {
        ArrayRandom arrayRandom = new ArrayRandom(3);

        Thread array = new Thread(new Runnable() {
            final ArrayRandom arrayRandom = new ArrayRandom(10);
            @Override
            public void run() {
                synchronized (arrayRandom) {
                    for (int i = 0; i < arrayRandom.length; i++) {
                        arrayRandom.fullArr();
                    }

                    for (int i = 0; i < arrayRandom.length; i++) {
                        System.out.print(arrayRandom.arr[i] + " ");
                    }

                    arrayRandom.notifyAll();
                }
            }
        });


        Thread sum = new Thread(new Runnable() {

            final ArrayRandom arrayRandom = new ArrayRandom(10);

            @Override
            public void run() {
                synchronized (arrayRandom){
                    try {
                        arrayRandom.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Сума чисел = " + arrayRandom.sumArr());

                }
            }
        });

        Thread average = new Thread();

        sum.start();
        //average.start();

        Thread.sleep(2000);

        array.start();

    }

}
