package medium2.task6test;

import medium2.task6.OddReverser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddReverserTest {
    @Test
    public void reverseOddTest1() {
        OddReverser odrev = new OddReverser();
        Assertions.assertEquals("Make sure you only reverse words of odd length",odrev.reverseOdd("Make sure uoy only esrever sdrow of ddo length"));
    }
    @Test
    public void reverseOddTest2() {
        OddReverser odrev = new OddReverser();
        Assertions.assertEquals("sananaB",odrev.reverseOdd("Bananas"));
    }
}

