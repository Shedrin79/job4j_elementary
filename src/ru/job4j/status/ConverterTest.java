package ru.job4j.status;


import org.junit.Assert;
import org.junit.Test;
import ru.job4j.status.Converter;

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
        int in = 0;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}