package org.itstep.Lesson34.MyPatterns.AbstractFactory;

public class ConfigCar {

    CarFactory carFactory;


    void configCar(CarFactory carFactory) {
        this.carFactory = carFactory;
    }


    void carInfo() {
        carFactory.getIngener().createCar();
        carFactory.getWorker().assembleTheCar();
    }


}
