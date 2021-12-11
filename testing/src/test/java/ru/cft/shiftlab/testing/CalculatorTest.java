package ru.cft.shiftlab.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.cft.shiftlab.testing.calculator.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Тест сложения значений")
    void plusTest() {
        int val = calculator.plus(1, 1);

        Assertions.assertEquals(2, val);
    }

    @Test
    @DisplayName("Тест вычитания значений")
    void minusTest() {
        int val = calculator.minus(2, 1);

        Assertions.assertEquals(1, val);
    }

    @Test
    @DisplayName("Тест деления значений")
    void divisionTest() {
        int val = calculator.division(2, 2);

        Assertions.assertEquals(1, val);
    }

    @Test
    @DisplayName("Тест деления значений на ноль")
    void divisionByZeroTest() {
        int val = calculator.division(2, 0);

        Assertions.assertEquals(Integer.MIN_VALUE, val);
    }

}
