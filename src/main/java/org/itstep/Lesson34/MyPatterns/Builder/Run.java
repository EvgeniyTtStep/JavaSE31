package org.itstep.Lesson34.MyPatterns.Builder;

public class Run {
    public static void main(String[] args) {

        ConfigCar nissanCar = new ConfigCar();
        nissanCar.createConfigCar("Nissan", "Sunny",250);


        ConfigCar tesla = new ConfigCar();
        tesla.createConfigCar("Tesla", "ModelX", 287);



        System.out.println(nissanCar.car);

        System.out.println(tesla.car);
    }
}
