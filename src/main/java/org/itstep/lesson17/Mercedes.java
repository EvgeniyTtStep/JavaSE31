package org.itstep.lesson17;

public class Mercedes extends Car{

    String complect;

    public Mercedes() {
    }

    public Mercedes(String color, String model, String number, String complect) {
        super(color, model, number);
        this.complect = complect;
    }

    @Override
    public void drive() {
        System.out.println("mercedes drive");
    }


    public void stop() {
        System.out.println("mercedes stop");
    }


    @Override
    public void showNumber() {
        System.out.println("show mercedes number");
    }

    public void luxery(){
        System.out.println("E31");
    }
}
