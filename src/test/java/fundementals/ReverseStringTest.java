package fundementals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void reverseString() {

        ReverseString reverseString = new ReverseString();
        assertEquals("drow" , reverseString.reverseString("word"));
    }
}