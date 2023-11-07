package org.itstep.lesson20.reflection;

public class Animal {
    private String name;
    private int age;

    public Animal() {
        this("bobik", 3);
    }

    private Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int countAge(int count) {
        return age + count;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
