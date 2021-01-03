package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest2 {

    @Test
    public void calc() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int out = Calculate.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void calc2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int out = Calculate.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void calc3() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int out = Calculate.calc(a, b, c, x);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void calc4() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int out = Calculate.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }
}