package org.itstep.lesson16.practice;

public class HumanMain {
    //Завдання 1: Створіть клас Human, який міститиме інформацію про людину.
    // За допомогою механізму успадкування реалізуйте клас Builder
    // (містить інформацію про будівельника),
    // клас Sailor (містить інформацію про моряка), клас Pilot
    // (містить інформацію про льотчика). Кожен із класів має містити необхідні для роботи методи.
    public static void main(String[] args) {
        Sailor sailor = new Sailor();
        sailor.setName("Valentin");
        sailor.goToSea();

        Builder builder = new Builder();
        builder.setName("Vasyl");
        builder.building();

        Pilot pilot = new Pilot();
        pilot.setName("Danyilo");
        pilot.fly();
    }
}
