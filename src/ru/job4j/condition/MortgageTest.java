package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MortgageTest {

    @Test
    public void when1year() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        int year = Mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }

}
