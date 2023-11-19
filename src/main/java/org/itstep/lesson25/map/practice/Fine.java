package org.itstep.lesson25.map.practice;

import java.util.HashMap;
import java.util.Map;

public class Fine {

    private String name;

    private Integer amount;

    private Map<String, Integer> fineSet = new HashMap<>();


    public Fine() {
    }

    public Fine(String name) {
        this.name = name;
    }


    public Fine(Map<String, Integer> fineSet) {
        this.fineSet = fineSet;
    }

    public Fine(String name, Map<String, Integer> fineSet) {
        this.name = name;
        this.fineSet = fineSet;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Map<String, Integer> getFineMap() {
        return fineSet;
    }

    public void setFineSet(Map<String, Integer> fineSet) {
        this.fineSet = fineSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void fillFines(String name, Integer amount) {
        fineSet.put(name, amount);
    }

    @Override
    public String toString() {
        return "Fine{" +
                ", fineSet=" + fineSet +
                '}';
    }
}
