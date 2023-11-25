package org.itstep.lesson28;

import java.util.*;
import java.util.stream.IntStream;

public class CollectionQuestions {

    // - ієрархія collection framework


    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        Set<String> set = new TreeSet<>();
        set.add("xxxx");
        set.add("cccc");
        set.add("bbbb");
        set.add("aaaa");
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();

        Map<String, Integer> treemap = new TreeMap<>();

        int[]arr = {1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);



    }
}
