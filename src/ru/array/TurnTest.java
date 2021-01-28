package ru.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void back34567() {
        int[] input = new int[]{3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = new int[]{7, 6, 5, 4, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void back12345() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }

    @Test
    public void back12345678910() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = Turn.back(input);
        int[] expected = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }

}
