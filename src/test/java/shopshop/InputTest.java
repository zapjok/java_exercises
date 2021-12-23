package shopshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;

public class InputTest {
    private static ByteArrayInputStream in;

    public void setInput(String input) {
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @ParameterizedTest
    @ValueSource(strings = {"teszt", "02013pidfsdf", "This is a sentence. This is another one!"})
    public void getItemNameTest(String testData) {
        Input inputter = new Input();
        setInput(testData);
        String actualResult = inputter.getItemName();
        Assertions.assertEquals(testData, actualResult);
    }
}
