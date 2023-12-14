package org.itstep.Lesson34.MyPatterns.Builder;

public class ConfigCar {
    Car car;


    public Car createConfigCar(String name, String model, int speed) {
         car = new CarBuilder()
                .carName(name)
                .carModel(model)
                .carSpeed(speed)
                .createCar();
        return car;
    }
}
