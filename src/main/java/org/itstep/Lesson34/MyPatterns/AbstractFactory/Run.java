package org.itstep.Lesson34.MyPatterns.AbstractFactory;

import org.itstep.Lesson34.MyPatterns.AbstractFactory.mercedes.MercedesFactory;

public class Run {
    public static void main(String[] args) {

     ConfigCar configCar = new ConfigCar();

     configCar.configCar(new MercedesFactory());
     configCar.carInfo();



    }
}
