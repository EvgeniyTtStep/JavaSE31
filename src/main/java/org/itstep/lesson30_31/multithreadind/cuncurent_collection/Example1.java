package org.itstep.lesson30_31.multithreadind.cuncurent_collection;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Example1 {
    public static void main(String[] args) {

        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        List<Integer> integers = new CopyOnWriteArrayList<>();

        Set<String> set = new CopyOnWriteArraySet<>();
    }
}
