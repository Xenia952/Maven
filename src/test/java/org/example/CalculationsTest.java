package org.example;

import org.example.lesson7.Calculations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationsTest {
    Calculations calculations = new Calculations();

    @Test
    public void factorial() {
        assertEquals(1, calculations.getFactorial(0));
        assertEquals(1, calculations.getFactorial(1));
        assertEquals(120, calculations.getFactorial(5));
    }

    @Test
    public void area() {
        assertEquals(5, calculations.getAreaOfTheTriangle(5, 2));
        assertEquals(10.5, calculations.getAreaOfTheTriangle(3, 7));
        assertEquals(0, calculations.getAreaOfTheTriangle(0, 1));
    }

    @Test
    public void testAdd() {
        assertEquals(11, calculations.add(8, 3));
        assertEquals(-2, calculations.add(5, -7));
        assertEquals(4.2, calculations.add(3.5, 0.7));
        assertEquals(9.3, calculations.add(8, 1.3));
        assertEquals(3.82, calculations.add(5, -1.18));
    }

    @Test
    public void testSubtract() {
        assertEquals(-5, calculations.subtract(3, 8));
        assertEquals(-7.7, calculations.subtract(8.3, 16));
        assertEquals(-4, calculations.subtract(-7, -3));
        assertEquals(2, calculations.subtract(8, 6));
        assertEquals(13, calculations.subtract(8, -5));
    }

    @Test
    public void testMultiply() {
        assertEquals(34, calculations.multiplication(2, 17));
        assertEquals(0, calculations.multiplication(0, 17));
        assertEquals(-40, calculations.multiplication(-8, 5));
        assertEquals(16.25, calculations.multiplication(3.25, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculations.division(4, 2));
        assertEquals(0, calculations.division(0, 5));
        assertEquals(2, calculations.division(-4, -2));
        assertEquals(0.78, calculations.division(4, 5.1));
        assertEquals(-1.25, calculations.division(4, -3.2));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculations.division(4, 0);
        });
    }

    @Test
    public void testCompareNumbers() {
        assertEquals("less", calculations.compareNumbers(3, 5));
        assertEquals("greater", calculations.compareNumbers(5, 3));
        assertEquals("equals", calculations.compareNumbers(7, 7));
        assertEquals("less", calculations.compareNumbers(1.000001, 1.000002));
        assertEquals("greater", calculations.compareNumbers(-1.25, -1.558));
    }
 }

