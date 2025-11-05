package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;


public class CalculationsTestNG {
    Calculations calculations = new Calculations();

    @Test
    public void factorial() {
        Assert.assertEquals(calculations.getFactorial(0), 1);
        Assert.assertEquals(calculations.getFactorial(1), 1);
        Assert.assertEquals(calculations.getFactorial(5), 120);
    }

    @Test
    public void area() {
        Assert.assertEquals(calculations.getAreaOfTheTriangle(5, 2), 5);
        Assert.assertEquals(calculations.getAreaOfTheTriangle(3, 7), 10.5);
        Assert.assertEquals(calculations.getAreaOfTheTriangle(0, 1), 0);
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(calculations.add(8, 3), 11);
        Assert.assertEquals(calculations.add(5, -7), -2);
        Assert.assertEquals(calculations.add(3.5, 0.7), 4.2);
        Assert.assertEquals(calculations.add(8, 1.3), 9.3);
        Assert.assertEquals(calculations.add(5, -1.18), 3.82);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculations.subtract(3, 8), -5);
        Assert.assertEquals(calculations.subtract(8.3, 16), -7.7);
        Assert.assertEquals(calculations.subtract(-7, -3), -4);
        Assert.assertEquals(calculations.subtract(8, 6), 2);
        Assert.assertEquals(calculations.subtract(8, -5), 13);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calculations.multiplication(2, 17), 34);
        Assert.assertEquals(calculations.multiplication(0, 17), 0);
        Assert.assertEquals(calculations.multiplication(-8, 5), -40);
        Assert.assertEquals(calculations.multiplication(3.25, 5), 16.25);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(calculations.division(4, 2), 2);
        Assert.assertEquals(calculations.division(0, 5), 0);
        Assert.assertEquals(calculations.division(-4, -2), 2);
        Assert.assertEquals(calculations.division(4, 5.1), 0.78);
        Assert.assertEquals(calculations.division(4, -3.2), -1.25);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculations.division(4, 0);
    }

    @Test
    public void testNumberIsLess() {
        assertTrue(calculations.numberIsLess(2, 5));
        assertTrue(calculations.numberIsLess(-1, 1));
        assertTrue(calculations.numberIsLess(-74, -32));
        assertFalse(calculations.numberIsLess(5, 1));
        assertFalse(calculations.numberIsLess(0, -5));
        assertFalse(calculations.numberIsLess(0.25, -1.35));
    }

    @Test
    public void testNumberIsGreat() {
        assertTrue(calculations.numberIsGreat(4, 1));
        assertTrue(calculations.numberIsGreat(-5, -125));
        assertTrue(calculations.numberIsGreat(0, -0.1));
        assertFalse(calculations.numberIsGreat(-1.25, 0));
        assertFalse(calculations.numberIsGreat(-5.23, -1));
    }

    @Test
    public void testNumberIsLessOrEqual() {
        assertTrue(calculations.numberIsEqual(5, 5));
        assertTrue(calculations.numberIsEqual(-5, -5));
        assertFalse(calculations.numberIsEqual(3, 1));
        assertFalse(calculations.numberIsEqual(-3, 3));
        assertFalse(calculations.numberIsEqual(0.254, -3));
    }
}


