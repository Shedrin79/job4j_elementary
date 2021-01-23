package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int[] rst = Square.calculate(3);
        int[] expect = new int[]{0, 1, 4};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5Then014916() {
        int[] rst = Square.calculate(5);
        int[] expect = new int[]{0, 1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
}