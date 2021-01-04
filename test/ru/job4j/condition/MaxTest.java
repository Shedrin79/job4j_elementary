package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        String expected = "Значение two максимально";
        String out = Max.max(1, 2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax7To5Then1() {
        String expected = "Значение one максимально";
        String out = Max.max(7, 5);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax7To7Then() {
        String expected = "Значение one максимально";
        String out = Max.max(7, 6);
        Assert.assertEquals(expected, out);
    }
}