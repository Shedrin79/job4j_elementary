package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenp4k1then1() {
        int p = 4;
        int k = 1;
        int expected = 1;
        double out = SqArea.square(4, 1);
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