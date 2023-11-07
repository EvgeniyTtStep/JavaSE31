package org.itstep.lesson20.statics;

public class Car extends Vehicle {

    private String number;

    private String engine;


    public static int count;


    public static final int WHEEL_COUNT = 4; // 2 ^ 32

    public Car() {
        count++;
    }

    public Car(String color, String model, String number) {
        super(color, model);
        this.number = number;
        count++;
    }

    public Car(String color, String model, String number, String engine) {
        super(color, model);
        this.number = number;
        this.engine = engine;
        count++;
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
    public  void drive() {
        System.out.println("car drive");
    }


    public void stop() {
        System.out.println("car stop");
    }


    public void showNumber() {
        System.out.println("sow car number");

    }

    public static void method(){
        System.out.println("I am a static method");
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
