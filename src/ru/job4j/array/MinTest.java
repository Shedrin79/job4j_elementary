package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void findMin() {
        int[]input = {6,2,3,4,5};
        int expected = 2;
        int rsl = Min.findMin(input);
        assertThat(rsl, is(expected));
    }
    @Test
    public void findMin1() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }
}