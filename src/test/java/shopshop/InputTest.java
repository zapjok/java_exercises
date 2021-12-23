package shopshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class InputTest {
    private static ByteArrayInputStream in;
    @Test
    public void getItemNameTest() {
        Input inputter = new Input();
        String expectedResult = inputter.getItemName();
        Assertions.assertEquals(expectedResult, "teszt1");
    }
}
