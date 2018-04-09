package com.fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


/*
LOG

1- extract method object fibonnaci function (tryed delegate with less good results)

2- move FibonacciFinder class to new file

3- inline fibonacci creation function in tests function

4- extract field from test of the new fibonacci finder

Follows at Fibonacci Finder


 */

@RunWith(Parameterized.class)
public class FibonacciIndexTest {

    private final int expectedIndex;
    private final long fibonacci;
    private FibonacciFinder fibonacciFinder;

    public FibonacciIndexTest(int expectedIndex, long fibonacci) {
        this.expectedIndex = expectedIndex;
        this.fibonacci = fibonacci;
    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {0, 0}, {1, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}, {8, 21}, {49, 7778742049L}
        });
    }

    @Test
    public void findsIndexOfFibonacciNumber() {
        fibonacciFinder = new FibonacciFinder();
        assertEquals(expectedIndex, fibonacciFinder.calculateIndexOf((int)fibonacci));
    }

    @Test
    public void whenNumberNotFoundThenIndexIsMinusOne() {
        assertEquals(-1, new FibonacciFinder().calculateIndexOf(4));
    }

    @Test
    public void cannotFindIndexOfNegativeNumber() {
        assertEquals(-1, new FibonacciFinder().calculateIndexOf(-1));
    }
}
