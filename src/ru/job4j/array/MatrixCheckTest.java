package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }
    @Test
    public void whenHasTwoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 2);
        assertThat(result, is(true));
    }
    @Test
    public void whenDoesnotHasTwoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }
    @Test
    public void whenDoesnotAgainHasTwoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 2);
        assertThat(result, is(false));
    }
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monovertical(input, 2);
        assertThat(result, is(true));
    }
    @Test
    public void whenDoesnHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monovertical(input, 2);
        assertThat(result, is(false));
    }
}