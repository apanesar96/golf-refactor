package com.fibonacci;

/*
 1- extract method is end of sequence

 passes tests

 2- type migrate return value of calculateIndexOf to long

 3- remove cast to int in endOfSeuquence

 passes tests

 4- naming of calculateIndexOf

 5 - is corner case return -1

 passes tests

 6 - wrap Primitive unfindable answer int

 7 - calculate fibonacci numbers

 8 - extracted function calculateNextFibonacciNumber

 pases test

 9 - return statement + erasure of temp var of index

 passes tests

 10 - refactored parameter

test don't pass

test pass

 11 - try to delete isOneOfFirstTwoNum...

 tests pass

 12 - removing vector, adding p & pp to fields

 test pass

 */
class FibonacciFinder {
    public static final int UNFINDABLE_ANSWER_INT = -1;
    private int lastInSerie;
    private int secondLast;

    public long calculateIndexOf(int fibonacciNumber) { // find not calculate
        lastInSerie = 1;
        secondLast = 0;
        long calculatedFibonacciNumber = 0;
        for ( int currentIndex = 2; calculatedFibonacciNumber < fibonacciNumber; currentIndex++) {
            calculatedFibonacciNumber = calculateNextFibonacciNumber();
            if (calculatedFibonacciNumber == fibonacciNumber) {
                return currentIndex;
            }

        }
        return UNFINDABLE_ANSWER_INT;
    }

    public long calculateNextFibonacciNumber() {
        int ans = secondLast + lastInSerie;
        secondLast = lastInSerie;
        lastInSerie = ans;
        return ans;
    }
}
