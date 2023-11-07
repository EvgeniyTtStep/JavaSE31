package org.itstep.lesson20.statics;

public class Main {
    public static void main(String[] args) {

      Car car1 = new Car("red", "model", "123");
      System.out.println(Car.count);
      Car.method();

    }


}
