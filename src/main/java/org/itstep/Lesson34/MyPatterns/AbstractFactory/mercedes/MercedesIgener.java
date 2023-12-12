package org.itstep.Lesson34.MyPatterns.AbstractFactory.mercedes;

import org.itstep.Lesson34.MyPatterns.AbstractFactory.Ingener;

public class MercedesIgener extends Ingener {
    @Override
    protected void createCar() {
        System.out.println("Інженер створює Mercedes");
    }
}
