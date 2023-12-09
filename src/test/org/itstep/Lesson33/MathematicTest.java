package org.itstep.Lesson33;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @CsvSource({
            "10, -10, 0",
            "20, 10, 30",
            "15, 15, 30"
    })
    void sumPositiveParameterizedTest(String first, String second, String third) {
        int actualRes = Mathematic.sum(Integer.parseInt(first),Integer.parseInt(second) );
        int expectedRes = Integer.parseInt(third);
        Assertions.assertEquals(expectedRes, actualRes);
    }


    @ParameterizedTest
    @ValueSource(ints = {10, -10, 20 })
    void sumPositiveParameterizedTest(int param) {
        int actualRes = Mathematic.sum(10, param);
        int expectedRes = 30;
        Assertions.assertEquals(expectedRes, actualRes);
    }



    @RepeatedTest(10)
    void sumPositiveRepeatedTest() {
        int actualRes = Mathematic.sum(10, 20);
        int expectedRes = 30;
        Assertions.assertEquals(expectedRes, actualRes);
    }


    @Disabled
    void divisionPositiveTest(){
        Assertions.assertEquals(5, mathematic.div(10, 2));
    }



    @Timeout(1)
    @Test
    void doubleSumPositiveTest() throws InterruptedException {
        Thread.sleep(2000);
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