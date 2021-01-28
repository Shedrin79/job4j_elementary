package ru.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {

    @Test
    public void exist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void notexist() {
        boolean result = Triangle.exist(2.0, 2.0, 5.0);
        assertThat(result, is(false));
    }

}