package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
    @Test
    public void skip1() {
        int[][] in = {
                {1, -2, -3},
                {-1, 2, 5},
                {2, 6, -7}
        };
        int[][] expect = {
                {1, 0, 0},
                {0, 2, 5},
                {2, 6, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
    @Test
    public void skip10() {
        int[][] in = {
                {1, 2, -3},
                {3, -5, -9}
        };
        int[][] expect = {
                {1, 2, 0},
                {3, 0, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
    }
