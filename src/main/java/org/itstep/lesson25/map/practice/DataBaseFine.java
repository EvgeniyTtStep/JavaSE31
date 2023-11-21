package org.itstep.lesson25.map.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataBaseFine {

    private Human human;
    private Set<Human> humans = new HashSet<>();

    public DataBaseFine() {
    }

    public Set<Human> getHumans() {
        return humans;
    }

    public void setHumans(Set<Human> humans) {
        this.humans = humans;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public void defaultDataBaseFine(){
        Fine fine1 = new Fine();
        fine1.fillFines("Fine1", 20);
        fine1.fillFines("Fine2", 15);
        fine1.fillFines("Fine3", 27);
        humans.add(new Human("Jack", 1111, "Kyiv", fine1));


        Fine fine2 = new Fine();
        fine2.fillFines("Fine4", 120);
        fine2.fillFines("Fine2", 15);
        fine2.fillFines("Fine5", 30);
        fine2.fillFines("Fine6", 10);
        humans.add(new Human("Max", 2222, "Dnipro", fine2));



        Fine fine3 = new Fine();
        fine3.fillFines("Fine4", 120);
        fine3.fillFines("Fine5", 30);
        humans.add(new Human("Tomas", 3333, "Lviv", fine3));
    }
}
