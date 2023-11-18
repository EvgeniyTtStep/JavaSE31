package org.itstep.lesson25.map;


import java.util.*;

class Car {
    String name;
    int vin;

    public Car(String name, int vin) {
        this.name = name;
        this.vin = vin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return vin == car.vin && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vin);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", vin=" + vin +
                '}';
    }
}

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> contacts = new HashMap<>();
        contacts.put("master", 12345);
        contacts.put("master", 78994);
        contacts.put("master", 11111);//value цього елемнту будуть записані в хеш мапу
        contacts.put("teacher", 45668);
        contacts.put("doctor", 369885);

//        System.out.println(contacts);

//        for (String string : contacts.keySet()) {
//            System.out.println("key = " +  string);
//        }
        for (Integer value : contacts.values()) {
            System.out.println("value = " + value);
        }
//
//        for (Map.Entry<String, Integer> entry : contacts.entrySet()) {
//            System.out.print("entry Key = " + entry.getKey());
//            System.out.println(" entry Value = " + entry.getValue());
//        }



        Map<Car, Integer> carMap = new HashMap<>();
        carMap.put(new Car("Toyota", 123), 10000);
        carMap.put(new Car("BMW", 456), 15000);
        carMap.put(new Car("BMW", 456), 15000);

        //System.out.println(carMap);

        Iterator<Map.Entry<Car, Integer>> iterator = carMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
