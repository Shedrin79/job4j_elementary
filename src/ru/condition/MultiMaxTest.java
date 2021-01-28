package ru.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void max1i4i2() {
        int rsl = MultiMax.max(1, 4, 2);
        assertThat(rsl, is(4));
    }

    @Test
    public void max100i14i21() {
        int rsl = MultiMax.max(100, 14, 21);
        assertThat(rsl, is(100));
    }

    @Test
    public void max10i140i21() {
        int rsl = MultiMax.max(10, 140, 21);
        assertThat(rsl, is(140));
    }

    @Test
    public void max10i140i210() {
        int rsl = MultiMax.max(10, 140, 210);
        assertThat(rsl, is(210));
    }

    @Test
    public void max10i10i10() {
        int rsl = MultiMax.max(10, 10, 10);
        assertThat(rsl, is(10));
    }
}