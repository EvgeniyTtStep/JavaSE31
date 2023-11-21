package org.itstep.lesson26.treemap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavMap {
    public static void main(String[] args) {

        TreeMap<String, Integer> navMap = new TreeMap<>();
        navMap.put("Alex", 10);
        navMap.put("Boris", 20);
        navMap.put("Bob", 20);
        navMap.put("kenny", 20);
        navMap.put("Danil", 30);

        Map.Entry<String, Integer> ceilingEntry = navMap.ceilingEntry("Alex");
        Map.Entry<String, Integer> floorEntry = navMap.floorEntry("Alex");

        Map.Entry<String, Integer> firstEntry = navMap.firstEntry();
        Map.Entry<String, Integer> lastEntry = navMap.lastEntry();

        System.out.println(firstEntry);
        System.out.println(lastEntry);


        System.out.println(ceilingEntry);
        System.out.println(floorEntry);


        SortedMap<String, Integer> sortedMap = navMap.subMap("Alex", "Danil");
        for (String string : sortedMap.keySet()) {
            System.out.println(string);
        }

    }
}
