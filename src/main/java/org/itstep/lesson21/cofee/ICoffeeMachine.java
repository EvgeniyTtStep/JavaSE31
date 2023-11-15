package org.itstep.lesson21.cofee;

public interface ICoffeeMachine {
    void turnOn();

    void turnOff();

    void makeEspresso();

    void makeAmericano();

    void cleanGarbageBox();

    void addCoffee(int amount);

    void addWater(int amount);
}
