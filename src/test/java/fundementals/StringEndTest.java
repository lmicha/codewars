package fundementals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringEndTest {
    @Test
    public void testSomething() {
        StringEnd stringEnd = new StringEnd();
        assertTrue(stringEnd.solution("abc" , "bc"));
        assertTrue(stringEnd.solution("samurai" , "ai"));
    }

    @Test
    public void testSomethingFalse() {
        StringEnd stringEnd = new StringEnd();
        assertFalse(stringEnd.solution("abc" , "d"));
        assertFalse(stringEnd.solution("sumo" , "omo"));
    }
}