package training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFunTest {

    @Test
    void findNextSquare() {

        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    void findNextSquare2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    void findNextSquare3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
}