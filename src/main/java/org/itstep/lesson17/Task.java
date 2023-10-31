package org.itstep.lesson17;

public class Task {

    //1. encapsulation
    //2. protected
    //3. extends
    //4. final
    //5. перегрузка методів/переопредление @Owerride
    //6. super() this()

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        mercedes.drive();
        mercedes.showNumber();

        Vehicle mercedes2 = new Mercedes();
        mercedes2.stop();

        Vehicle car = new Car();
        car.drive();

        Mercedes mercedes3 = new Mercedes();


        ToyCar toyCar = new ToyCar();
        toyCar.drive();


    }
}
