package org.itstep.Lesson35.practice.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {

    static List<Integer> integers = new ArrayList<>();


    public static void fillRandom() {
        for (int i = 0; i < 10; i++) {
            integers.add(new Random().nextInt(10, 100));
        }

    }

}
