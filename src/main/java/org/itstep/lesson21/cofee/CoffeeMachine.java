package org.itstep.lesson21.cofee;

public abstract class CoffeeMachine implements ICoffeeMachine{
    private int maxWaterLevel;
    private int maxCoffeeLevel;
    private int maxGarbageLevel;

    private int currentWaterLevel;
    private int currentCoffeeLevel;
    private int currentGarbageLevel;


    public CoffeeMachine(int maxWaterLevel, int maxCoffeeLevel, int maxGarbageLevel) {
        this.maxWaterLevel = maxWaterLevel;
        this.maxCoffeeLevel = maxCoffeeLevel;
        this.maxGarbageLevel = maxGarbageLevel;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void makeEspresso() {

    }

    @Override
    public void makeAmericano() {

    }

    @Override
    public void cleanGarbageBox() {

    }
}
