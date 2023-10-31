package org.itstep.lesson17;

public class ToyCar {

    Car car;


    public ToyCar() {
        this.car = new Car();
    }

    public void drive(){
        System.out.print("Toy ");
        car.drive();
    }
}
