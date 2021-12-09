import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ContainsWTest {
    @ParameterizedTest
    @ValueSource(strings = {"","3resource","123456"})
    public void containswTestFalse(String testData) {
        ContainsW containsw = new ContainsW();
        boolean actualResult = containsw.containsw(testData);
        Assertions.assertFalse(actualResult);
    }
    @ParameterizedTest
    @ValueSource(strings = {"w3resource","w3wresource","w3reswourcew"})
    public void containswTestTrue(String testData) {
        ContainsW containsw = new ContainsW();
        boolean actualResult = containsw.containsw(testData);
        Assertions.assertTrue(actualResult);
    }
}

