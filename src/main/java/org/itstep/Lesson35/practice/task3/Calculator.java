package org.itstep.Lesson35.practice.task3;

import java.util.List;

public class Calculator {

    public int sum(List<Integer> integers) {
        int sum = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
        }
        return sum;
    }

}
