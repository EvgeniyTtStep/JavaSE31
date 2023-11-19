package org.itstep.lesson25.map.practice;

import java.util.List;
import java.util.Objects;

public class Human {
    private String name;
    private int inn;

    private String city;


    private Fine fine;

    public Human() {
    }



    public Human(String name, int inn, String city, Fine fine) {
        this.name = name;
        this.inn = inn;
        this.city = city;
        this.fine = fine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return getInn() == human.getInn();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInn());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Fine getFine() {
        return fine;
    }

    public void setFine(Fine fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", inn=" + inn +
                ", city='" + city + '\'' +
                ", fine=" + fine +
                '}';
    }
}
