package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void checkCorrectPosition() {
        BishopBlack bishop = new BishopBlack(Cell.B1);
        Cell result = bishop.position();
        assertThat(result, is(Cell.B1));
    }

    @Test
    public void checkMethodCopy() {
        BishopBlack bishop = new BishopBlack(Cell.B1);
        Figure result = bishop.copy(Cell.C3);
        assertThat(result.position(), is(Cell.C3));
    }

    @Test
    public void checkMethodWay() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] result = bishop.way(Cell.C1, Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result, is(expected));
    }

    @Test
    public void checkMethodIsDioganal() {
        BishopBlack bishop = new BishopBlack(Cell.F8);
        boolean result = bishop.isDiagonal(Cell.F8, Cell.F7);
        assertThat(result, is(false));
    }
}