package org.itstep.Lesson33;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicTest {

    Mathematic mathematic;

    @BeforeEach
    void initialMethod(){
        mathematic = new Mathematic();
        System.out.println("Start test");
    }

    @AfterEach
    void exitMethod(){
        System.out.println("End test");
    }


    @Test
    void divisionPositiveTest(){
        Assertions.assertEquals(5, mathematic.div(10, 2));
    }



    @Test
    void doubleSumPositiveTest(){
        System.out.println("test");
        double actual = Mathematic.sumDouble(0.1, 0.7);
        double expected = 0.8;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void sumPositiveTest() {
        System.out.println("test");

        int actualRes = Mathematic.sum(10, 20);
        int expectedRes = 30;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void sumNegativeTest() {
        System.out.println("test");

        int actualRes = Mathematic.sum(-10, -20);
        int expectedRes = -30;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void sumZeroTest() {
        System.out.println("test");

        int actualRes = Mathematic.sum(0, 0);
        int expectedRes = 0;
        Assertions.assertEquals(expectedRes, actualRes);
    }
}