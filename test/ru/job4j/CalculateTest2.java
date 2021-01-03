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
        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int expected2 = 2;
        int out2 = Calculate.calc2(a2, b2, c2, x2);
        Assert.assertEquals(expected2, out2);
    }

    @Test
    public void calc3() {
        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int expected3 = 2;
        int out3 = Calculate.calc3(a3, b3, c3, x3);
        Assert.assertEquals(expected3, out3);

    }

    @Test
    public void calc4() {
        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;
        int expected4 = 1;
        int out4 = Calculate.calc4(a4, b4, c4, x4);
        Assert.assertEquals(expected4, out4);
    }
}