package org.itstep.lesson15.car;

public class Main {
    public static void main(String[] args) {

        Car tesla = new Car();
        tesla.name = ""; // public
        tesla.color = ""; //protected
        tesla.vendor = ""; //default
        //tesla.model = ""; // private
        tesla.setModel("");
        System.out.println(tesla.getModel());

    }
}
