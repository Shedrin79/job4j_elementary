package ru.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChessBoardTest {

    @Test
    public void way6712() {
        int way = ChessBoard.way(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void way7007() {
        int way = ChessBoard.way(7, 0, 0, 7);
        assertThat(way, is(7));
    }

    @Test
    public void way2641() {
        int way = ChessBoard.way(2, 6, 4, 1);
        assertThat(way, is(0));

    }
}