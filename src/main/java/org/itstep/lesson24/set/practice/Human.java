package org.itstep.lesson24.set.practice;

import java.util.List;
import java.util.Objects;

public class Human {
    private String name;
    private int inn;

    private String city;


    private List<Fine> fineList;

    public Human() {
    }

    public Human(String name, int inn, String city, List<Fine> fineList) {
        this.name = name;
        this.inn = inn;
        this.city = city;
        this.fineList = fineList;
    }


    public void show(){
        System.out.println("name = " + name);
        System.out.println("inn = " + inn);
        System.out.println("city = " + city);
        for (Fine fine : fineList) {
            System.out.println("fine name = " + fine.getName());
        }
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

    public List<Fine> getFineList() {
        return fineList;
    }

    public void setFineList(List<Fine> fineList) {
        this.fineList = fineList;
    }


}
