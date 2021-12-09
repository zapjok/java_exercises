import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsValidZipTest {
    @ParameterizedTest
    @ValueSource(strings = {"59001","12345","99999"})
    public void zipValidatorTrue (String testData) {
        IsValidZip isvalidzip = new IsValidZip();
        Assertions.assertTrue(isvalidzip.zipValidator(testData));
    }
    @ParameterizedTest
    @ValueSource(strings = {"853a7","732 32","393939"})
    public void zipValidatorFalse (String testData) {
        IsValidZip isvalidzip = new IsValidZip();
        Assertions.assertFalse(isvalidzip.zipValidator(testData));
    }
}
