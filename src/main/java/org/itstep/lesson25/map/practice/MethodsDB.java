package org.itstep.lesson25.map.practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MethodsDB {


    private DataBaseFine dataBaseFine;

    public MethodsDB() {
        dataBaseFine = new DataBaseFine();
        dataBaseFine.defaultDataBaseFine();//створюємо(заповнюємо БД)
    }

    public void printDataBase() {
        Set<Human> humans = dataBaseFine.getHumans();
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public void printByINN(int code) {
        if (code > 0) {
            Set<Human> humans = dataBaseFine.getHumans();
            for (Human human : humans) {
                if (human.getInn() == code) {
                    System.out.println(human);
                }
            }
        }

    }

    public void printUsersByFineType(String typeFine) {
        if (typeFine != null && !typeFine.isBlank()) {
            Set<Human> humans = dataBaseFine.getHumans();
            for (Human human : humans) {
                if (human.getFine().getFineMap().get(typeFine) != null && human.getFine().getFineMap().get(typeFine) > 0) {
                    System.out.println(human);
                }
            }
        }
    }

    public void removeFine(String name, String typeFine) {
        if (typeFine != null && !typeFine.isBlank()) {
            Set<Human> humans = dataBaseFine.getHumans();

            for (Human human : humans) {
                if (human.getName().equals(name) && human.getFine().getFineMap().get(typeFine) != null && human.getFine().getFineMap().get(typeFine) > 0) {
                    human.getFine().getFineMap().remove(typeFine);
                    System.out.println(human);
                }
            }
        }
    }

    public void addHuman(String name, int inn, String city) {
        Set<Human> humans = dataBaseFine.getHumans();
        humans.add(new Human(name, inn, city, new Fine()));
    }
}
