package org.itstep.lesson17;

public class ToyCar {
    Car car; //ассоциация

    public ToyCar() {
        this.car = new Car();//композиция
    }

    public ToyCar(Car car) { //агрегация
        this.car = car;
    }

    public void drive(){
        System.out.print("Toy ");
        //car.drive();
    }
}
