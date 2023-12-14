package org.itstep.Lesson35.practice.task3;

import java.util.List;

import static org.itstep.Lesson35.practice.task3.Data.fillRandom;

public class Run {
    //Задание 3
    //Есть класс, предоставляющий доступ к набору чисел.
    //Источником этого набора чисел является некоторый
    //файл. С определенной периодичностью данные в фай
    //ле меняются (надо реализовать механизм обновления).
    //Приложение должно получать доступ к этим данным
    //и выполнять набор операций над ними (сумма, максимум,
    //минимум и т.д.). При каждой попытке доступа к этому
    //набору необходимо вносить запись в лог-файл. При реализации используйте паттерн Proxy (для логгирования)
    //и другие необходимые паттерны.
    public static void main(String[] args) {

        fillRandom();

        List<Integer> integers = Data.integers;

        CalculatorProxy calculatorProxy = new CalculatorProxy();

        int sum = calculatorProxy.sum(integers);

        System.out.println("sum = " + sum + " " +calculatorProxy.logger);

    }
}
