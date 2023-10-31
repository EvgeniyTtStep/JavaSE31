package org.itstep.lesson17;

public class Vehicle {

    String color;
    String model;

    public Vehicle() {
    }

    public Vehicle(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void drive(){
        System.out.println("drive");
    }

    public  void stop(){
        System.out.println("stop");
    }
}
