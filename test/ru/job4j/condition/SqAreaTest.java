package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenp6k2then2() {
        int p = 6;
        int k = 2;
        int expected = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp100k50then48() {
        int p = 100;
        int k = 50;
        double expected = 48.058;
        double out = SqArea.square(100, 50);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp200k100then98() {
        int p = 200;
        int k = 100;
        double expected = 98.029;
        double out = SqArea.square(200, 100);
        Assert.assertEquals(expected, out, 0.01);

    }
}