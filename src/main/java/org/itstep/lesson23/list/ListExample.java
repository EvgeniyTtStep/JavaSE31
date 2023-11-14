package org.itstep.lesson23.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        int[] arr = {10, 45, 56};
        arr[0] = 12;
        int[]arr1 = {87, 89};
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
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }


        String[] colorArr = {"red", "green", "blue"};


        List<String> colorAsList = new ArrayList<>(Arrays.asList(colorArr));

        List<String>colorList = new ArrayList<>(List.of(colorArr));

        System.out.println("\n"+colorAsList);
        System.out.println(colorList);

    }
}
