package condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int expected = 2;
        int out = Max.max(1, 2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax7To5Then1() {
        int expected = 7;
        int out = Max.max(7, 5);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax7To7Then() {
        int expected = 7;
        int out = Max.max(7, 6);
        Assert.assertEquals(expected, out);
    }
}