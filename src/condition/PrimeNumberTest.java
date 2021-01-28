package condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {

    @Test
    public void calc() {
        int a = PrimeNumber.calc(5);
        assertThat(a, is(3));
    }

    @Test
    public void when11() {
        int a = PrimeNumber.calc(11);
        assertThat(a, is(5));
    }

    @Test
    public void when2() {
        int a = PrimeNumber.calc(2);
        assertThat(a, is(1));
    }
}