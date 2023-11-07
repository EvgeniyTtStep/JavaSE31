package org.itstep.lesson20;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Hw {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);
        System.out.println(time.getMinute());
        System.currentTimeMillis();

        int charge = 100;

        for (int i = 0; i < 10; i++) {
            charge--;
            Thread.sleep(6000);
            System.out.println(charge);
        }
    }
}
