package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {


    @Test
    public void mass5() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void mass3() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void mass7() {
        int[] input = new int[] {3, 4, 1, 2, 5, 10, 13};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 10, 13};
        assertThat(result, is(expect));
    }
    @Test
    public void mass2() {
        int[] input = new int[] {4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 4};
        assertThat(result, is(expect));
    }
}