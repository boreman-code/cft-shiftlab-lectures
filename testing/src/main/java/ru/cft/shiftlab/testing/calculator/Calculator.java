package ru.cft.shiftlab.testing.calculator;

public class Calculator {

    public int plus(int i, int i1) {
        return i + i1;
    }

    public int minus(int i, int i1) {
        return i -i1;
    }

    public int division(int i, int i1) {
        if (i1 == 0) {
            return Integer.MIN_VALUE;
        }

        return i / i1;
    }
}
