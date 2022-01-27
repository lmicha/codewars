package fundementals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YesOrNoTest {

    @Test
    void yesTest() {
        YesOrNo convert = new YesOrNo();
        assertEquals("Yes" , convert.boolToString(true));
    }

    @Test
    void noTest() {
        YesOrNo convert = new YesOrNo();
        assertEquals("No" , convert.boolToString(false));
    }
}