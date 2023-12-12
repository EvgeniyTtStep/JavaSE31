package org.itstep.Lesson34.MyPatterns.AbstractFactory.mercedes;

import org.itstep.Lesson34.MyPatterns.AbstractFactory.CarFactory;
import org.itstep.Lesson34.MyPatterns.AbstractFactory.Ingener;
import org.itstep.Lesson34.MyPatterns.AbstractFactory.Worker;

public class MercedesFactory implements CarFactory {

    @Override
    public Ingener getIngener() {
        return new MercedesIgener();
    }

    @Override
    public Worker getWorker() {
        return new MercedesWorker();
    }
}
