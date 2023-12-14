package org.itstep.Lesson35.practice.task3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CalculatorProxy {

    List<String>logger = new ArrayList<>();

    Calculator calculator;

    public CalculatorProxy() {
        calculator = new Calculator();
    }

    public int sum(List<Integer>integers){
        logger.add("Sum " + LocalDateTime.now());
        return calculator.sum(integers);
    }

}
