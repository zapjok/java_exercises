package medium2.task3test;

import medium2.task3.BoolBit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoolBitTest {
    @Test
    public void toBitStringDeep() {
        byte[] expectedResult = {0, 1, 1, 0};
        BoolBit bolbi = new BoolBit();
        Assertions.assertArrayEquals(expectedResult,bolbi.toBitString("deep"));
    }
    @Test
    public void toBitStringLoves() {
        byte[] expectedResult = {0, 1, 0, 1, 1};
        BoolBit bolbi = new BoolBit();
        Assertions.assertArrayEquals(expectedResult,bolbi.toBitString("loves"));

    }
    @Test
    public void toBoolArray0110() {
        boolean[] expectedResult = {false, true, true, false};
        BoolBit bolbi = new BoolBit();
        Assertions.assertArrayEquals(expectedResult, bolbi.toBoolArray(new byte[] {0 , 1, 1, 0}));
    }
    @Test
    public void toBoolArray01011() {
        boolean[] expectedResult = {false, true, false, true, true};
        BoolBit bolbi = new BoolBit();
        Assertions.assertArrayEquals(expectedResult, bolbi.toBoolArray(new byte[] { 0, 1, 0, 1, 1}));
    }
}

