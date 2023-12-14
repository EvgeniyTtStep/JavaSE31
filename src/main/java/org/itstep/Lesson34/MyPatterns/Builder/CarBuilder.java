package org.itstep.Lesson34.MyPatterns.Builder;

public class CarBuilder {
    String carName;
    String carModel;
    int carSpeed;


    CarBuilder carName(String name) {
        this.carName = name;
        return this;
    }

    CarBuilder carModel(String model) {
        this.carModel = model;
        return this;
    }

    CarBuilder carSpeed(int speed) {
        this.carSpeed = speed;
        return this;
    }


    public Car createCar() {
        Car car = new Car();
        car.setName(carName);
        car.setModel(carModel);
        car.setMaxSpeed(carSpeed);
        return car;
    }
}
