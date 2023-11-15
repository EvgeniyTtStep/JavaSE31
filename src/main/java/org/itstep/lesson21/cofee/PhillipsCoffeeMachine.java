package org.itstep.lesson21.cofee;

public class PhillipsCoffeeMachine extends CoffeeMachine {


    public PhillipsCoffeeMachine() {
        super(3000, 700, 2400);
    }

    public PhillipsCoffeeMachine(int maxWaterLevel, int maxCoffeeLevel, int maxGarbageLevel) {
        super(maxWaterLevel, maxCoffeeLevel, maxGarbageLevel);
    }
}
