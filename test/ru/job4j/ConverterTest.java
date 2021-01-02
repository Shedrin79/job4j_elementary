package ru.job4j;


import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConverter120RubleThen2Dollar() {
        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}