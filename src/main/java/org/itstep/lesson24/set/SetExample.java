package org.itstep.lesson24.set;

import java.util.*;

class Developer implements Comparable<Developer> {
    String name;
    int salary;

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer developer)) return false;
        return this.salary == developer.salary && Objects.equals(name, developer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Developer developer) {
        return this.name.compareTo(developer.name);
    }
}

public class SetExample {
    public static void main(String[] args) {
        //1 не можна додавати однакові
        //2 не обіцяє порядку
        Set<Integer> integerSet = new HashSet<>();
//        Set<Integer> integerSet = new LinkedHashSet<>(); //зберігається порядок додавання елементів
        integerSet.add(10);
        integerSet.add(15);
        integerSet.add(15);
        integerSet.add(27);
        integerSet.add(59);
        integerSet.add(99);
        integerSet.remove(10);
        System.out.println(integerSet);

        for (Integer item : integerSet) {
            System.out.print(item + " ");
            System.out.println(item.hashCode());
        }


        Set<Developer> developers = new HashSet<>();
        //developers.add(null);
        developers.add(new Developer("J", 1000));
        developers.add(new Developer("I", 1031));
        developers.add(new Developer("Max", 1001));
        developers.add(new Developer("Max", 1001));
        developers.add(new Developer("Max", 1001));
        developers.add(new Developer("Alex", 1002));
        developers.add(new Developer("Alex", 1005));
        developers.add(new Developer("Zohan", 1003));
        developers.add(new Developer("Bob", 1004));

        for (Developer developer : developers) {
            System.out.println(developer.name + " " + developer.salary + " " + developer.hashCode());
        }

        System.out.println("============ TreeSet =============");


        Set<Developer> developerTree = new TreeSet<>(developers);
        for (Developer developer : developerTree) {
            System.out.println(developer.name + " " + developer.salary);
        }


    }
}
