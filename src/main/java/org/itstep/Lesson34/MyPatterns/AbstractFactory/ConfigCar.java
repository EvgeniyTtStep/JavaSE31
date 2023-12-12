package org.itstep.Lesson34.MyPatterns.AbstractFactory;

public class ConfigCar {

    CarFactory carFactory;

    static Ingener ingener;
    static  Worker worker;


    static void  configCar(CarFactory carFactory){
                 ingener = carFactory.getIngener();
         worker = carFactory.getWorker();

    }


   static void carInfo(){
        ingener.createCar();
        worker.assembleTheCar();
    }


}
