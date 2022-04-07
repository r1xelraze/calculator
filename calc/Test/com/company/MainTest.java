package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void PlusEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 + 5");
        assertEquals(10, calculator.PlusAndMinus() );

    }
    @Test
    void MinusEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 - 5");
        assertEquals(0, calculator.PlusAndMinus() );

    }
    @Test
    void divisionEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 / 5");
        assertEquals(1, calculator.PlusAndMinus() );

    }
    @Test
    void multiplicationEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 * 5");
        assertEquals(25, calculator.PlusAndMinus() );
    }
    @Test
    void remainderDivisionEqualFour() {
        Main.Calculator calculator = new Main.Calculator("5 % 2");
        assertEquals(1, calculator.PlusAndMinus() );
    }
    @Test
    void exponentiationEqualFour() {
        Main.Calculator calculator = new Main.Calculator("2 ^ 5");
        assertEquals(32, calculator.PlusAndMinus() );
    }
    @Test
    void ExceptionEqualFour() {
        Main.Calculator calculator = new Main.Calculator("eq+rqr");
        assertEquals( "Некорректный ввод! incorrect input!"  , calculator.PlusAndMinus() );
    }




}