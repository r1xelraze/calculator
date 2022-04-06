package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void PlusEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 + 5");
        assertEquals(10, calculator.calculate() );

    }
    @Test
    void MinusEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 - 5");
        assertEquals(0, calculator.calculate() );

    }
    @Test
    void divisionEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 / 5");
        assertEquals(1, calculator.calculate() );

    }
    @Test
    void multiplicationEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 * 5");
        assertEquals(25, calculator.calculate() );
    }
    @Test
    void remainderDivisionEqualFour() {
        Main.Calculator calculator = new Main.Calculator("2 % 5");
        assertEquals(2, calculator.calculate() );
    }
    @Test
    void exponentiationEqualFour() {
        Main.Calculator calculator = new Main.Calculator("2 ^ 5");
        assertEquals(32, calculator.calculate() );
    }
    @Test
    void ExceptionEqualFour() {
        Main.Calculator calculator = new Main.Calculator("eqeq");
        assertEquals(0, calculator.calculate() );
    }



}