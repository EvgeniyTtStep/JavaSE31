package org.itstep.lesson20.statics;

public abstract class Vehicle implements Transport {

    String color;
    String model;

    public Vehicle() {
    }

    public Vehicle(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public void drive(){
        System.out.println("Vehicle drive");
    }

    @Override
    public  void stop(){
        System.out.println("stop");
    }


    public void middleMethod(){
        System.out.println("middle");
    }

    public abstract void abstractMethod();


}
