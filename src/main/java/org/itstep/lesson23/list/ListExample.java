package org.itstep.lesson23.list;

import java.lang.reflect.Array;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        int[] arr = {10, 45, 56};
        arr[0] = 12;
        int[] arr1 = {87, 89};
        //arr = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr));


        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(56);
        list.add(86);
        list.add(18);
        System.out.println(list.get(3));
        list.set(0, 99);
        list.add(2, 55);
        list.remove(1);
        System.out.println(list.contains(56));
        System.out.println("size = " + list.size());
        System.out.println(list);


        System.out.println("\nfor");
        for (int i = 0; i < list.size(); i++) { //arr.length
            System.out.print(list.get(i) + " "); //arr[i]
        }

        System.out.println("\nforeach");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        System.out.println("\nIterator");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


        String[] colorArr = {"red", "green", "blue"};


        List<String> colorAsList = new ArrayList<>(Arrays.asList(colorArr));

        List<String> colorList = new ArrayList<>(List.of(colorArr));

        System.out.println("\n" + colorAsList);
        System.out.println(colorList);


        System.out.println("\nasList");
        List<String> stringList = Arrays.asList(colorArr); //повертає прихований масив під вишлядом ліста
        //stringList.add("black"); //UnsupportedOperationException
        //stringList.add(0, "black");
        stringList.set(0, "black");
        System.out.println(stringList);


        System.out.println("\nList.of");
        List<String> stringList1 = List.of(colorArr);//Immutable object
        //stringList1.add("pink");
        //stringList1.remove(0);
        //stringList1.set(0, "pink");


        List<Double>doubleList = new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(1.6);

        List<Double>doubleList1 = new ArrayList<>(doubleList);
        doubleList1.add(3.6);

        System.out.println("doubleList1 = " + doubleList1);


        System.out.println("==== LinkedList ====");
        List<Character> characters = new LinkedList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        System.out.println("characters.get(0) = " + characters.get(0));
    }
}
