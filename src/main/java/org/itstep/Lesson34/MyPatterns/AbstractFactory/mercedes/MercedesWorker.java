package org.itstep.Lesson34.MyPatterns.AbstractFactory.mercedes;

import org.itstep.Lesson34.MyPatterns.AbstractFactory.Worker;

public class MercedesWorker extends Worker {


    @Override
    protected void assembleTheCar() {
        System.out.println("Мерседес робітник збирає авто");
    }
}
