package org.itstep.lesson26.treemap;

import org.checkerframework.checker.units.qual.A;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Animal  {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getAge() == animal.getAge() && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Animal, Integer> animalMap = new TreeMap(Comparator.comparing(Animal::getName).thenComparing(Animal::getAge));
        animalMap.put(new Animal("cat", 1), 1000);
        animalMap.put(new Animal("cat", 2), 1001);
        animalMap.put(new Animal("cat", 3), 1002);
        animalMap.put(new Animal("cat", 4), 1003);

        for (Map.Entry<Animal, Integer> animalIntegerEntry : animalMap.entrySet()) {
            System.out.println(animalIntegerEntry);
        }
    }
}
