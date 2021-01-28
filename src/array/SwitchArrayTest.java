package array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to4() {
        int[] input = {6, 7, 8, 9, 10};
        int[] expected = {10, 7, 8, 9, 6};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSwap3To4() {
        int[] input = {6, 7, 8, 9, 10};
        int[] expected = {6, 7, 8, 10, 9};
        int[] rsl = SwitchArray.swap(input, 3, input.length - 1);
        assertThat(rsl, is(expected));
    }
}