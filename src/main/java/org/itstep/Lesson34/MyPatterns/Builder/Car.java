package org.itstep.Lesson34.MyPatterns.Builder;

public class Car {

    String name;
    String model;
    int maxSpeed;


    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
