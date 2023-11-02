package org.itstep.lesson17;

public class Car extends Vehicle {

    private String number;

    private String engine;

    public Car() {
    }

    public Car(String color, String model, String number) {
        super(color, model);
        this.number = number;
    }

    public Car(String color, String model, String number, String engine) {
        super(color, model);
        this.number = number;
        this.engine = engine;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("car drive");
    }


    public void stop() {
        System.out.println("car stop");
    }



    public  void showNumber(){
        System.out.println("sow car number");
    }

    @Override
    public void middleMethod() {
        super.middleMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Car abstract method");
    }
}
