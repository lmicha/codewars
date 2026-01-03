package rankUp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadFishTest {

    @Test
    void parse() {

        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));

    }

    @Test
    void parse2() {
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }


    @Test
    void parse3() {
        assertArrayEquals(new int[] {0, 0, 0,0}, DeadFish.parse("odioidooitsimsd"));
    }
}