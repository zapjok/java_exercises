package medium2.task4test;

import medium2.task4.RemoveReChar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveReCharTest {
    @Test
    public void unrepeatedTest1() {
        RemoveReChar remover = new RemoveReChar();
        Assertions.assertEquals("cal 91", remover.unrepeated("call 911"));
    }
    @Test
    public void unrepeatedTest2() {
        RemoveReChar remover = new RemoveReChar();
        Assertions.assertEquals("WE!", remover.unrepeated("WWE!!!"));
    }
}

