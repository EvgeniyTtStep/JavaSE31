package org.itstep.lesson27;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamApiExample {

    static List<String> strings = new ArrayList<>();

    static {
        strings.add("aaa3");
        strings.add("bbb5");
        strings.add("ccc1");
        strings.add("aaa6");
        strings.add("bbb2");
        strings.add("aaa0");
        strings.add("ccc");
    }

    public static void main(String[] args) {

        //var1
        List<String> strings = new ArrayList<>();
        Stream<Object> array = Stream.of(strings.toArray());

        //var2
        Stream<String> stream = strings.stream();

        //var3
//        List<Integer> integers = new ArrayList<>();
//        Integer[] array1 = (Integer[])integers.toArray();
//        IntStream.of(array1);

        // ==== methods =====
        showList();
        filterEx();
        sorting();
        System.out.println(mapExample());
        List<Integer> integerList = mapExample();
        minMaxExample(integerList);
        countEx(integerList);
        avarageEx(integerList);
    }

    private static void avarageEx(List<Integer> integerList) {


        IntSummaryStatistics summaryStatistics = integerList.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics();


        System.out.println("summaryStatistics.getAverage() = " + summaryStatistics.getAverage());
        System.out.println("summaryStatistics.getMax() = " + summaryStatistics.getMax());
        System.out.println("summaryStatistics.getMin() = " + summaryStatistics.getMin());
        System.out.println("summaryStatistics.getSum() = " + summaryStatistics.getSum());
        System.out.println("summaryStatistics.getCount() = " + summaryStatistics.getCount());

    }

    private static void countEx(List<Integer> integerList) {
        System.out.println("count");
/*        int count = 0;
        for (Integer integer : integerList) {
            if (integer%2 == 0){
                count++;
            }
        }*/


        long count = integerList
                .stream()
                .filter(integer -> integer % 2 == 0)
                .count();

        System.out.println("count = " + count);
    }

    private static void minMaxExample(List<Integer> integerList) {
        System.out.println("min max");
        int max = integerList.get(0);
        int min = integerList.get(0);
//        for (Integer integer : integerList) {
//            if (Integer.compare(integer, max) > 0){
//                max = integer;
//            }
//            if (Integer.compare(integer, min) < 0){
//                min = integer;
//            }
//        }
        max = integerList.stream().max(Integer::compareTo).get();
        min = integerList.stream().min(Integer::compareTo).get();


        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

    private static List<Integer> mapExample() {
        System.out.println("map");
/*      List<Integer> integerList = new ArrayList<>();
        for (String string : strings) {
            if (string.length() == 4) {
                integerList.add(Integer.parseInt(string.substring(3)));
            }
}*/


        List<Integer> integerList = strings
                .stream()
                .filter(s -> s.length() == 4)
                .map(s -> Integer.parseInt(s.substring(3)))
                .toList();


        return integerList;
    }

    private static void sorting() {
        System.out.println("sorting");
/*        strings.sort(String::compareTo);
        for (String string : strings) {
            if (string.startsWith("a")) {
                System.out.println(string);
            }
        }*/


        strings
                .stream()
                .sorted()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);

    }

    private static void filterEx() {
        System.out.println("filter");
/*        for (String string : strings) {
            if (string.startsWith("a")) {
                System.out.println(string);
            }
        }*/

        List<String> collect = strings
                .stream()
                .filter(s -> s.startsWith("b"))
                //.collect(Collectors.toList())
                .toList();

        collect.forEach(System.out::println);
    }

    private static void showList() {

/*        for (String string : strings) {
            System.out.println(string);
        }*/

        //stream
        strings
                .stream()
                .forEach(System.out::println);
    }
}
