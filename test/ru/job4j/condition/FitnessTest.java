package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FitnessTest {

    @Test
    public void whenI95N90() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));

    }

    @Test
    public void whenI90N95() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));

    }

    @Test
    public void whenIvan50Nik90() {
        int month = Fitness.calc(50, 90);
        assertThat(month, is(2));
    }
}