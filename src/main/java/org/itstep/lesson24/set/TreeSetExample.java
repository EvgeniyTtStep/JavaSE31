package org.itstep.lesson24.set;


import java.util.*;

class JavaDeveloper {
    private String name;
    private int salary;

    public JavaDeveloper(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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
        return "name= " + name + ", salary=" + salary;
    }

}

public class TreeSetExample {
    public static void main(String[] args) {
        Set<JavaDeveloper> javaDeveloper = new TreeSet<>(Comparator.comparing(JavaDeveloper::getName).thenComparingInt(JavaDeveloper::getSalary));
        javaDeveloper.add(new JavaDeveloper("Jack", 1000));
        javaDeveloper.add(new JavaDeveloper("Max", 1000));
        javaDeveloper.add(new JavaDeveloper("Alex", 1000));
        javaDeveloper.add(new JavaDeveloper("Alex", 1001));
        javaDeveloper.add(new JavaDeveloper("Zohan", 1000));





//        for (JavaDeveloper developer : javaDeveloper) {
//            System.out.println(developer.getName() + " " + developer.getSalary());
//        }


        List<JavaDeveloper> developerList = new ArrayList<>(javaDeveloper);

        for (JavaDeveloper developer : developerList) {
            System.out.println(developer);
        }


    }
}
