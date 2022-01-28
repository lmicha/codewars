package fundementals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquareTest {

    @Test
    public void test1() {
        PerfectSquare perfectSquare = new PerfectSquare();
        assertEquals(144, perfectSquare.findNextSquare(121));
    }

    @Test
    public void test2() {
        PerfectSquare perfectSquare = new PerfectSquare();
        assertEquals(676, perfectSquare.findNextSquare(625));
    }
    @Test
    public void test3() {
        PerfectSquare perfectSquare = new PerfectSquare();
        assertEquals(-1 , perfectSquare.findNextSquare(114));
    }
}