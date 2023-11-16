package org.itstep.lesson24.set;

import java.util.*;

class Developer extends Object{
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
        return salary == developer.salary && Objects.equals(name, developer.name);
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
            System.out.print(item+" ");
            System.out.println(item.hashCode());
        }


        Set<Developer> developers = new HashSet<>();
        developers.add(new Developer("Jack", 1000));
        developers.add(new Developer("Jack", 1000));
        developers.add(new Developer("Jack", 1000));
        developers.add(new Developer("Jack", 1001));

        for (Developer developer : developers) {
            System.out.println(developer.name + " " + developer.salary + " " + developer.hashCode());
        }

    }
}
